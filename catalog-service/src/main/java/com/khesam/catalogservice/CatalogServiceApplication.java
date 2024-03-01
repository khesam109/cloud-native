package com.khesam.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@code @SpringBootApplication} is a shortcut that includes three different annotations
 * <p>
 * 1. {@code @Configuration} marks the class as a source of beans definitions
 * <p>
 * 2. @ComponentScan enables component scanning to find and register beans in the Spring context automatically
 * <p>
 * 3. {@code @EnableAutoConfiguration} enables the autoconfiguration capabilities offered by Spring Boot
 */
@SpringBootApplication
public class CatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

}
