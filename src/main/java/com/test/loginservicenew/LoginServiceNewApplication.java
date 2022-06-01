package com.test.loginservicenew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoginServiceNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginServiceNewApplication.class, args);
	}

}
