package com.mx.ProyectoDulce.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DULCE")

public class Dulce {
	/*CREATE TABLE ROPA(
    ID NUMBER PRIMARY KEY,
    NOMBRE NVARCHAR2(100),
    MARCA NVARCHAR2(100),
    DOUBLE PRECIO
	); */
	
	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String marca;
	@Column
	double precio;
	
	public Dulce() {
		
	}
	
	public Dulce(int id) {
		this.id = id;
	}

	public Dulce(int id, String nombre, String marca, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Dulce [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + "]";
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
