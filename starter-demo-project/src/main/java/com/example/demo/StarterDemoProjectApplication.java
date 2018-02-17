package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StarterDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterDemoProjectApplication.class, args);
	}

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String getMessage() {
		return "Hello My first application...";
	}
}

/**

localhost:8080/greeting
localhost:8080/health
localhost:8080/env
localhost:8080/beans
localhost:8080/metrics
localhost:8080/mappings
localhost:8080/trace

*/