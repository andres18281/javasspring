package com.example.form;



import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Dao {
 
  public void Guardar(String nombre,String correo) {
	 Transaction transacion = null; 
	 try(Session session = HibernateUtil.getSessionFactory().openSession()) {
		 session.beginTransaction();
		 transacion = session.beginTransaction();
		 Persona per = new Persona();
		 per.setEmail(correo);
		 per.setNombre(nombre);
		 session.save(per);
		 //transacion.commit();
		 session.getTransaction().commit();
	     HibernateUtil.shutdown();
	     System.out.println("si entro");
	 }catch(Exception e) {
		 System.out.println("no entro");
		 System.out.println(e.toString());
	 }
  }
}
