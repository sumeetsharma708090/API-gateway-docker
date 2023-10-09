package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import co.elastic.apm.attach.ElasticApmAttacher;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		ElasticApmAttacher.attach();
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
