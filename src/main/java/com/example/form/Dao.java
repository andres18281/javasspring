package com.example.form;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

public class Dao {
  @Autowired
  public void Guardar(Persona persona) {
	 Transaction transaction = null; 
	 SessionFactory mifactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Persona.class).buildSessionFactory();
	 Session miSession = mifactory.openSession();
	 try{
		 miSession.beginTransaction();
		 //Persona persona2 = new Persona();
		 System.out.print("email "+persona.getEmail());
		 //persona2.setEmail(persona.getEmail());
		 //persona2.setNombre(persona2.getNombre());
		 miSession.save(persona);
		 miSession.getTransaction().commit();
		 miSession.close();
	 }catch(Exception e) {
		 System.out.println("no entro");
		 System.out.println(e.toString());
	 }finally {
		 mifactory.close();
	 }
	 /*
	 try(Session session = HibernateUtil.getSessionFactory().openSession()) {
		 transaction = session.beginTransaction();
		// save the student object
		 session.beginTransaction();
		 transaction = session.beginTransaction();
		 session.save(persona);
		 transaction.commit();
		 session.getTransaction().commit();
	     HibernateUtil.shutdown();
	     System.out.println("si entro");
	 }catch(Exception e) {
		 System.out.println("no entro");
		 System.out.println(e.toString());
	 }*/
  }
}
