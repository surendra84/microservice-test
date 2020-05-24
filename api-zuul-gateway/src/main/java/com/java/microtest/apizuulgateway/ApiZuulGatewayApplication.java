package com.java.microtest.apizuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ApiZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiZuulGatewayApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleimpleFilter() {
		return new SimpleFilter();
	}

}
