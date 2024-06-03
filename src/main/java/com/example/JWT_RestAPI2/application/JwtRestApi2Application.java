package com.example.JWT_RestAPI2.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class JwtRestApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(JwtRestApi2Application.class, args);
	}

}
