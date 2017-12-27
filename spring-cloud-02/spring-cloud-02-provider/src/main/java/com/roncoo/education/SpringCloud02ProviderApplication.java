package com.roncoo.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloud02ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud02ProviderApplication.class, args);
	}
}
