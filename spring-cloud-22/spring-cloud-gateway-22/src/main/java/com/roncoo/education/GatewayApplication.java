package com.roncoo.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.roncoo.education.custom.CustomPreFilter;

@EnableZuulProxy
@SpringBootApplication
public class GatewayApplication {

	@Bean
	public CustomPreFilter sessionPreFilter() {
		return new CustomPreFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}
