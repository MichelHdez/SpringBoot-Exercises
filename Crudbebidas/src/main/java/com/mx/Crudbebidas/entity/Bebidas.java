package com.mx.Crudbebidas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="VENTAS_BEBIDAS")
public class Bebidas {
	
	
	/*
	 * CREATE TABLE VENTAS_BEBIDAS(
 ID NUMBER PRIMARY KEY NOT NULL,
 NOMBRE NVARCHAR2(20),
 MARCA NVARCHAR2(20),
 SABOR NVARCHAR2(20),
 CANTIDAD NUMBER,
 PRECIO NUMBER
);
	 * */
	
	@Id
	@Column(name="ID", columnDefinition = "NUMBER", nullable = false)
	int id;
	@Column(name="NOMBRE", columnDefinition = "NVARCHAR2(20)", nullable = false)
	String nombre;
	@Column(name="MARCA", columnDefinition = "NVARCHAR2(20)", nullable = false)
	String marca;
	@Column(name="SABOR", columnDefinition = "NVARCHAR2(20)", nullable = false)
	String sabor;
	@Column(name="CANTIDAD", columnDefinition = "NUMBER", nullable = false)
	int cantidad;
	@Column(name="PRECIO", columnDefinition = "NUMBER", nullable = false)
	double precio;
	
	public Bebidas() {
	
	}

	public Bebidas(int id) {
	
		this.id = id;
	}

	public Bebidas(int id, String nombre, String marca, String sabor, int cantidad, double precio) {
		
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
				+ cantidad + ", precio=" + precio + "]\n";
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	

}
