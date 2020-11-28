package com.example.LinkedinBasicProfle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = {"com.example.LinkedinBasicProfle.entity"})
public class LinkedinBasicProfleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkedinBasicProfleApplication.class, args);
	}

}
