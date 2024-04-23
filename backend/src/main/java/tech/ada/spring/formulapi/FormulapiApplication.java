package tech.ada.spring.formulapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import tech.ada.spring.formulapi.Models.Driver;
import tech.ada.spring.formulapi.Models.MRData;
import tech.ada.spring.formulapi.Models.Resp;

import java.util.Arrays;

@SpringBootApplication
public class FormulapiApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(FormulapiApplication.class, args);

		System.out.println("It's online");

		// RestTemplate
		RestTemplate restTemplate = new RestTemplate();

		// Endpoint
		String url = "https://ergast.com/api/f1/drivers.json";

		// Get
		ResponseEntity<Resp> response = restTemplate.getForEntity(url, Resp.class);
		System.out.println(response.getBody().getMRData().getDriverTable().getDrivers().get(0).getUrl());

		// Check the response status code
		if (response.getStatusCode().is2xxSuccessful()) {


			System.out.println("dasda");



		} else {
			System.out.println("Error: Unsuccessful HTTP request. Status code: " + response.getStatusCodeValue());
		}
	}

}
