package com.example.form;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.istack.NotNull;



//@XmlRootElement(name = "persona")
//@XmlAccessorType(XmlAccessType.FIELD)

@Entity
@Table(name="persona")
public class Persona implements Serializable  {
	/**
	 * 
	 */
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	@NotNull
	public Long id;
	@Column(name="nombre", unique = true, nullable = false)
	 @NotNull
	public String nombre;
	@Column(name="email", unique = true, nullable = false)
	 @NotNull
	public String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	@Transient
	private static long serialVersionUID = 1L;
	
}
