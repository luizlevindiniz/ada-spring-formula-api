package tech.ada.spring.formulapi.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DriverTable {

    private @JsonProperty("Drivers")  List<Driver> Drivers;

    public List<Driver> getDrivers() {
        return Drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        Drivers = drivers;
    }
}
