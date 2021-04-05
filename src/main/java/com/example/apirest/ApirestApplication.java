package com.example.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.apirest.controller.UserRestController;
//

//


//@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })

//@EnableJpaRepositories("com.example.apirest.dao")
@SpringBootApplication
@ComponentScan("com.example.apirest.*") 
@EntityScan("com.example.apirest.entity")
public class ApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}

}
