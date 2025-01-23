package com.money_tracker.eureka_serivce_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSerivceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSerivceRegistryApplication.class, args);
	}
}
