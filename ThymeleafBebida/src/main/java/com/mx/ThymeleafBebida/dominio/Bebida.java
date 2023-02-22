package com.mx.ThymeleafBebida.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BEBIDA")
public class Bebida {
	/*CREATE TABLE BEBIDA(
	 ID NUMBER PRIMARY KEY,
	 NOMBRE NVARCHAR2(100),
	 MARCA NVARCHAR2(100),
	 PRECIO NUMBER,
	 CONT_NETO NUMBER
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
	@Column
	int cont_neto;
	
	public Bebida() {
		
	}
	
	public Bebida(int id) {
		this.id=id;
	}

	public Bebida(int id, String nombre, String marca, double precio, int cont_neto) {
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.cont_neto = cont_neto;
	}

	@Override
	public String toString() {
		return "Bebida [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", cont_neto="
				+ cont_neto + "\n]";
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

	public int getCont_neto() {
		return cont_neto;
	}

	public void setCont_neto(int cont_neto) {
		this.cont_neto = cont_neto;
	}

	
	
	
}
