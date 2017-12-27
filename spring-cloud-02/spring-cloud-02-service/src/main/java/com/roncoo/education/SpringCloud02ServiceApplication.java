package com.roncoo.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloud02ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud02ServiceApplication.class, args);
	}
}
