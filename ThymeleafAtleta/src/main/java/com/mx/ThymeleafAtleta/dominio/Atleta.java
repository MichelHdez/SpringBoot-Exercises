package com.mx.ThymeleafAtleta.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ATLETA")
public class Atleta {
	/*CREATE TABLE ATLETA(
	ID NUMBER PRIMARY KEY,
	NOMBRE NVARCHAR2(100) NOT NULL,
	APELLIDO NVARCHAR2(100) NOT NULL,
	SEXO NVARCHAR2(100) NOT NULL,
	EQUIPO NVARCHAR2(100) NOT NULL
	);*/
	
	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String apellido;
	@Column
	String sexo;
	@Column
	String equipo;
	
	public Atleta() {
		
	}
	
	public Atleta(int id) {
		this.id=id;
	}

	public Atleta(int id, String nombre, String apellido, String sexo, String equipo) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Atleta [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", equipo="
				+ equipo + "\n]";
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	
	
}
