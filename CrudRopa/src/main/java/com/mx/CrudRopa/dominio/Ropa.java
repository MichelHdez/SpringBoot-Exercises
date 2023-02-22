package com.mx.CrudRopa.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROPA")
public class Ropa {
	
	/*CREATE TABLE ROPA(
    ID NUMBER PRIMARY KEY,
    ESTILO NVARCHAR2(100),
    PRECIO NUMBER,
    COLOR NVARCHAR2(100),
    MARCA NVARCHAR2(100)
	); */
	
	@Id
	@Column
	int id;
	@Column
	String estilo;
	@Column
	double precio;
	@Column
	String color;
	@Column
	String marca;
	
	public Ropa() {
		
	}
	
	public Ropa(int id) {
		this.id = id;
	}

	public Ropa(int id, String estilo, double precio, String color, String marca) {
		this.id = id;
		this.estilo = estilo;
		this.precio = precio;
		this.color = color;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ropa [id=" + id + ", estilo=" + estilo + ", precio=" + precio + ", color=" + color + ", marca=" + marca
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	}
