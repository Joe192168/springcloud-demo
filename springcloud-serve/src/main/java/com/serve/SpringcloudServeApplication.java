package com.serve;

import org.apache.servicecomb.pack.omega.spring.EnableOmega;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableOmega
@MapperScan(basePackages = {"com.serve.mapper"})
public class SpringcloudServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServeApplication.class, args);
	}

}
