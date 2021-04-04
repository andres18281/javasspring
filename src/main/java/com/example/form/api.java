package com.example.form;


import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class api {
	
	
	
	@PostMapping(path = "/entidad", consumes = "application/json", produces = "application/json")
	public void inserta(@RequestBody Entidad entidad) {
		 

		//currentSession.saveOrUpdate(entidad);  
		Dao dao = new Dao();
		//dao.GuardarEntidad(entidad);
		dao.save(entidad);
	}
	
	
	
	@GetMapping("/get")
	public String get() {
		return "hola";
	}
	
}


