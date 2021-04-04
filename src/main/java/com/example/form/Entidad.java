package com.example.form;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.relational.core.mapping.Table;

@Embeddable
@Entity
@Table(value="entidad")
public class Entidad implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Entidad(){
		
	}
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   public Integer id;
   
	public Integer getId() {
	return id;
}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getRol() {
		return rol;
	}
	public void setRol(Integer rol) {
		this.rol = rol;
	}
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	@Column(name="nombre", unique = true, nullable = false, columnDefinition = "varchar(255)")
	public String nombre;
	@Column(name="rol", nullable = false, columnDefinition = "int(1)")
	public Integer rol;
	@Column(name="activo", nullable = false, columnDefinition = "int(1)")
	public Integer activo;
}



