package tech.ada.spring.formulapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FormulapiApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(FormulapiApplication.class, args);

		System.out.println("It's online");

	}

}
