package com.java.microtest.microserviceonedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceOneDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOneDemoApplication.class, args);
	}

	@RequestMapping
	public String helloWord(){
		return "Hello World!";
	}
}


