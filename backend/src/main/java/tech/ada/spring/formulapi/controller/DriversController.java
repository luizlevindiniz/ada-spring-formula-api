package tech.ada.spring.formulapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import tech.ada.spring.formulapi.Models.Driver;
import tech.ada.spring.formulapi.Models.Resp;
import tech.ada.spring.formulapi.service.DriverService;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173")
public class DriversController {

    private DriverService driverService;
    @Autowired
    public DriversController(DriverService driverService) {
        this.driverService = driverService;
    }

    public DriversController() { }

    public String initialize() {

        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Endpoint
        String url = "https://ergast.com/api/f1/2023/drivers.json";

        // Get
        ResponseEntity<Resp> response = restTemplate.getForEntity(url, Resp.class);

        // Check the response status code
        if (response.getStatusCode().is2xxSuccessful()) {


            List<Driver> drivers = response.getBody().getMRData().getDriverTable().getDrivers();
            drivers.forEach(driver -> driverService.saveDriver(driver));

            return "Drivers initialized";

        } else {
            System.out.println("Error: Unsuccessful HTTP request. Status code: " + response.getStatusCodeValue());
            throw new RuntimeException("Error: Unsuccessful HTTP request. Status code: " + response.getStatusCodeValue());
        }
    }

    @GetMapping("/drivers")
    public List<Driver> drivers() {

        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Endpoint
        String url = "https://ergast.com/api/f1/2023/drivers.json";

        // Get
        ResponseEntity<Resp> response = restTemplate.getForEntity(url, Resp.class);

        // Check the response status code
        if (response.getStatusCode().is2xxSuccessful()) {

            return response.getBody().getMRData().getDriverTable().getDrivers();

        } else {
            System.out.println("Error: Unsuccessful HTTP request. Status code: " + response.getStatusCodeValue());
            throw new RuntimeException("Error: Unsuccessful HTTP request. Status code: " + response.getStatusCodeValue());
        }
    }

}
