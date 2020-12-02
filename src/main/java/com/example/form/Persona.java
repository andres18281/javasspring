package com.example.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
@XmlRootElement(name = "Persona")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(value="Persona")
public class Persona {
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
 
	@Id
	@Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="nombre")
	public String nombre;
	@Column(name="email")
	public String email;
}
