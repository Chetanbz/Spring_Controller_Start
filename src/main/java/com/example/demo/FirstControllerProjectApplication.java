package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstControllerProjectApplication {

	public static void main(String[] args) {
		System.out.println("It is running from Base file i.e first file");
		SpringApplication.run(FirstControllerProjectApplication.class, args);
	}

}
