package tech.ada.spring.formulapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DriversController {


    @GetMapping("/drivers")
    public Iterable<String> drivers() {

        return null;
    }

}
