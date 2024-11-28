package com.va.week12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(
		scanBasePackages={"com.va.week12", 
		"com.va.week12.controller", 
		"com.va.week12.model",
		"com.va.week12.service"}
)
@ComponentScan("com.va.week12")
@EntityScan(basePackages = {"com.va.week12.service"})

public class Wk12Assign4WorkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Wk12Assign4WorkingApplication.class, args);
		
		System.out.println("Running springboot app for book..");
	}

}
