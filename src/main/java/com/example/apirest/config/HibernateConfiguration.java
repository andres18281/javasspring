package com.example.apirest.config;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfiguration {
	@Bean
	public EntityManager createEntityManagerBean(){
	    return Persistence.createEntityManagerFactory("entidad")
	           .createEntityManager();
	}
}

