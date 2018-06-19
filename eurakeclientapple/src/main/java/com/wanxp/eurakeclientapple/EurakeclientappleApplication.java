package com.wanxp.eurakeclientapple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurakeclientappleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakeclientappleApplication.class, args);
	}
}
