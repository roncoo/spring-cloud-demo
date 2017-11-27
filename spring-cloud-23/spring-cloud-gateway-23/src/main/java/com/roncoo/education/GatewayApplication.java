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
	
	/*@Bean
	public PatternServiceRouteMapper serviceRouteMapper() {
		return new PatternServiceRouteMapper("(?<name1>^.*)-(?<name2>c.*)-(?<name3>c.+$)", "${name1}-${name2}-provider") {
			@Override
			public String apply(final String serviceId) {
				String route = super.apply(serviceId);
				System.out.println(route + " -> " + serviceId);
				return route;
			}
		};
	}*/


	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}
