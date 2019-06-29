package com.springcloudauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.springcloudauth.dao")
public class SpringcloudAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudAuthApplication.class, args);
	}

}
