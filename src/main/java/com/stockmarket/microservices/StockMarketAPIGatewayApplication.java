package com.stockmarket.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class StockMarketAPIGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockMarketAPIGatewayApplication.class, args);
	}

	/*
	 * @Bean public WebMvcConfigurer configure() { return new WebMvcConfigurer() {
	 * 
	 * @Override public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/*") .allowedOrigins("*") .allowedMethods("GET", "POST",
	 * "PUT", "DELETE"); } }; }
	 */

}
