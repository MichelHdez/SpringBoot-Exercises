package com.mx.ThymeleafAnuncio.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ANUNCIO")
public class Anuncio {

	/*
	 * CREATE TABLE ANUNCIO( ID NUMBER PRIMARY KEY, NOMBRE NVARCHAR2(100), ASUNTO
	 * NVARCHAR2(100), DESCRIPCION NVARCHAR2(200) );
	 */

	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String asunto;
	@Column
	String descripcion;

	public Anuncio() {

	}

	public Anuncio(int id) {
		this.id = id;
	}

	public Anuncio(int id, String nombre, String asunto, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.asunto = asunto;
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Anuncio [id=" + id + ", nombre=" + nombre + ", asunto=" + asunto + ", descripcion=" + descripcion + "\n]";
	}

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

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
