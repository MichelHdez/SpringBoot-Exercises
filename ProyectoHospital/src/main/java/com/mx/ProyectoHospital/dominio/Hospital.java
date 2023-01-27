package com.mx.ProyectoHospital.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HOSPITAL")
public class Hospital {
	
	/*CREATE TABLE HOSPITAL(
    ID NUMBER PRIMARY KEY,
    NOMBRE NVARCHAR2(100),
    DIRECCION NVARCHAR2(100),
    TELEFONO NUMBER
	);*/
	
	
	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String direccion;
	@Column
	double telefono;

	public Hospital() {
		
	}
	
	public Hospital(int id) {
		this.id=id;
	}

	public Hospital(int id, String nombre, String direccion, double telefono) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "\n]";
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getTelefono() {
		return telefono;
	}

	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}

	
	
}
