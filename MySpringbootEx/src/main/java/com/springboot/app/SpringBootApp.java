package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp {
	public static void main(String[] args) 
    {
		System.out.println("in spring boot...");
        SpringApplication.run(SpringBootApp.class, args);
    }
}
