package com.example.form;
import java.io.File;

import javax.persistence.EntityManager;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

public class Dao {
  @Autowired
  private EntityManager entityManager;
  @Autowired
  public void Guardar(Persona persona) {
	 Transaction transaction = null; 
	 SessionFactory mifactory = new Configuration().configure(new File("src/main/resources/hibernate.cfg.xml")).buildSessionFactory();
	 Session miSession = mifactory.openSession();
	 try{
		 miSession.beginTransaction();
		 //Persona persona2 = new Persona();
		 //persona2.setEmail(persona.getEmail());
		 //persona2.setNombre(persona2.getNombre());
		 Integer i = (Integer)miSession.save(persona);
		 System.out.println("i : "+i);
		 miSession.getTransaction().commit();
		 miSession.close();
	 }catch(Exception e) {
		 System.out.println("no entro");
		 System.out.println(e.toString());
	 }finally {
		 mifactory.close();
	 }
  }
  @Autowired
  public void GuardarEntidad(Entidad persona) {
		 Transaction transaction = null; 
		 SessionFactory mifactory = new Configuration().configure(new File("src/main/resources/hibernate.cfg.xml")).buildSessionFactory();
		 Session miSession = mifactory.openSession();
		 try{
			 miSession.beginTransaction();
			 //Persona persona2 = new Persona();
			 //persona2.setEmail(persona.getEmail());
			 //persona2.setNombre(persona2.getNombre());
			 Integer i = (Integer)miSession.save(persona);
			 System.out.println("i : "+i);
			 miSession.getTransaction().commit();
			 miSession.close();
		 }catch(Exception e) {
			 System.out.println("no entro");
			 System.out.println(e.toString());
		 }finally {
			 mifactory.close();
		 }
  }
  
  public void save(Entidad entidad) {
		
	  	Session currentSession = entityManager.unwrap(Session.class);
	  	currentSession.saveOrUpdate(entidad);  
  }
}
