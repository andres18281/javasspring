package com.example.form;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Type;





//@XmlRootElement(name = "persona")
//@XmlAccessorType(XmlAccessType.FIELD)
@Embeddable
@Entity
@Table(name="persona")
public class Persona implements Serializable  {
	
	
	public Persona(){
		
	}
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Type(type = "objectid")
	public int id;
	
	@Column(name="email", unique = true, nullable = false, columnDefinition = "varchar(255)")
	public String email;
	@Column(name="nombre", unique = false, nullable = false, columnDefinition = "varchar(255)")
	public String nombre;
	
	private static final long serialVersionUID = 1L;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
 
	
}
