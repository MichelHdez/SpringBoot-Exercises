package com.mx.ThymeleafFruta.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FRUTA")
public class Fruta {
	/*CREATE TABLE FRUTA(
	ID NUMBER PRIMARY KEY,
	NOMBRE NVARCHAR2(100),
	PRECIO NUMBER,
	COLOR NVARCHAR2(100)
	); */
	
	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	double precio;
	@Column
	String color;
	
	public Fruta() {
		
	}
	
	public Fruta(int id) {
		this.id=id;
	}

	public Fruta(int id, String nombre, double precio, String color) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruta [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", color=" + color + "\n]";
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
