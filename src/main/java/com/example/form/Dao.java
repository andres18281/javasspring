package com.example.form;



import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Dao {
 
  public void Guardar(Persona persona) {
	 Transaction transaction = null; 
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
	 }
  }
}
