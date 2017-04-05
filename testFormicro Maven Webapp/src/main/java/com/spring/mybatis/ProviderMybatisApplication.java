package com.spring.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderMybatisApplication {

	public static void main(String[] args){
		SpringApplication.run(ProviderMybatisApplication.class, args);
	}
	
}
