package tech.ada.spring.formulapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tech.ada.spring.formulapi.controller.DriversController;
import tech.ada.spring.formulapi.service.DriverService;

@SpringBootApplication
public class FormulapiApplication {

	public static void main(String[] args) throws JsonProcessingException {
		ApplicationContext ctx = SpringApplication.run(FormulapiApplication.class, args);
		DriverService driverService = ctx.getBean(DriverService.class);
		DriversController driversController = new DriversController(driverService);
		driversController.initialize();
		System.out.println("It's online");

	}

}
