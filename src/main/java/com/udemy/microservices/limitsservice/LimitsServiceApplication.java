package com.udemy.microservices.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LimitsServiceApplication {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled","false");
		SpringApplication.run(LimitsServiceApplication.class, args);
	}

}
