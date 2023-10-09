package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.elastic.apm.attach.ElasticApmAttacher;

@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		ElasticApmAttacher.attach();
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
