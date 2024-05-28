package com.arkadip.apiCall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.arkadip.apiCall.service")
public class ApiCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCallApplication.class, args);
	}

}
