package com.alituran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.alituran.model.User;

@EntityScan(basePackages = "com.alituran")
@SpringBootApplication
public class OopodevApplication {

	public static void main(String[] args) {
		SpringApplication.run(OopodevApplication.class, args);
		
	}

}
