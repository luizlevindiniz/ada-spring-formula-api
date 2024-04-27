package tech.ada.spring.formulapi.service;

import org.springframework.stereotype.Service;
import tech.ada.spring.formulapi.Models.Driver;
import tech.ada.spring.formulapi.repository.DriverRepository;

@Service
public class DriverService {
    private DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }


    public void saveDriver(Driver driver) {
        boolean exists = driverRepository.existsById(driver.getDriverId());

        if(exists) {
            throw new RuntimeException("Driver already exists");
        }

        driverRepository.save(driver);
    }

}
