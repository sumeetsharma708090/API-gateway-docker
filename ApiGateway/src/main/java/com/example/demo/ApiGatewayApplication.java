package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import co.elastic.apm.attach.ElasticApmAttacher;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		ElasticApmAttacher.attach();
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
}
