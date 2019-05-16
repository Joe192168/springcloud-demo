package com.eureka8001.springcloudeureka8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEureka8001Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEureka8001Application.class, args);
	}

}
