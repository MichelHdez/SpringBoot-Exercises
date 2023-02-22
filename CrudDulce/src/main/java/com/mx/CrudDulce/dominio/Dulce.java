package com.mx.CrudDulce.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DULCE")
public class Dulce {

	/*
	 * CREATE TABLE DULCE( ID NUMBER PRIMARY KEY, NOMBRE NVARCHAR2(100), PRECIO
	 * NUMBER, MARCA NVARCHAR2(100) );
	 */

	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	double precio;
	@Column
	String marca;

	public Dulce() {

	}

	public Dulce(int id) {
		this.id = id;
	}

	public Dulce(int id, String nombre, double precio, String marca) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Dulce [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + "]\n";
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
