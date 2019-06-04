package com.client;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDistributedTransaction
@MapperScan(basePackages = {"com.client.mapper"})
public class SpringcloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudClientApplication.class, args);
	}

}
