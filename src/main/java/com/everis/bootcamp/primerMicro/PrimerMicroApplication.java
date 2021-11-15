package com.everis.bootcamp.primerMicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PrimerMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerMicroApplication.class, args);
	}

}
