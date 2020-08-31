package com.ds2technologies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerApplication {
//TODO - http://localhost:8080/swagger-ui/ (URl to access swagger documentation)
//TODO - http://localhost:8080/swagger-resources
//TODO - http://localhost:8080/v2/api-docs
	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}
}

