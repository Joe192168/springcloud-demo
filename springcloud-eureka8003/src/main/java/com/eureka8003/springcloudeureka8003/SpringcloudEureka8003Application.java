package com.eureka8003.springcloudeureka8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEureka8003Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEureka8003Application.class, args);
	}

}
