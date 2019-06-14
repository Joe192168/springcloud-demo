package com.client;

import org.apache.servicecomb.pack.omega.spring.EnableOmega;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableOmega
@MapperScan(basePackages = {"com.client.mapper"})
public class SpringcloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudClientApplication.class, args);
	}

}
