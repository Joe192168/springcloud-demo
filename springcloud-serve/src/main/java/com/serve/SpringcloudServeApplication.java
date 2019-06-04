package com.serve;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDistributedTransaction
@MapperScan(basePackages = {"com.serve.mapper"})
public class SpringcloudServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServeApplication.class, args);
	}

}
