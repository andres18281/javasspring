package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={
"com.example.form", "com.example.application"})
@ComponentScan({ "com.example.form"})
//@ComponentScan({ "com.controller.package1, com.controller.package2, com.controller.package3, com.controller.packageN", "controller", "service" } // If our Controller class or Service class is not in the same packages we have //to add packages's name like this...directory(package) with main class
public class Demo1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
