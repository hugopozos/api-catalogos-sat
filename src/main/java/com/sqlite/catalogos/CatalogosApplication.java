package com.sqlite.catalogos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class CatalogosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogosApplication.class, args);
	}

}
