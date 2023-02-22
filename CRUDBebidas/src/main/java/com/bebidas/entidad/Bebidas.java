package com.bebidas.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VENTAS_BEBIDAS")
public class Bebidas {

	/*
	 * CREATE TABLE VENTAS_BEBIDAS( ID NUMBER PRIMARY KEY NOT NULL, NOMBRE
	 * NVARCHAR2(20), MARCA NVARCHAR2(20), SABOR NVARCHAR2(20), CANTIDAD NUMBER,
	 * PRECIO NUMBER );
	 */

	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String marca;
	@Column
	String sabor;
	@Column
	double cantidad;
	@Column
	double precio;

	public Bebidas() {

	}

	public Bebidas(int id, String nombre, String marca, String sabor, double cantidad, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.sabor = sabor;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Bebidas [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", sabor=" + sabor + ", cantidad="
				+ cantidad + ", precio=" + precio + "\n]";
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

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
