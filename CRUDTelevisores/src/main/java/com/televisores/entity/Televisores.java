package com.televisores.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TELEVISORES")
public class Televisores {

	/*
	 * CREATE TABLE TELEVISORES( ID NUMBER PRIMARY KEY NOT NULL, MARCA
	 * NVARCHAR2(30), MODELO NVARCHAR2(30), PULGADAS NUMBER, COLOR NVARCHAR2(20),
	 * PRECIO NUMBER);
	 */

	@Id
	@Column(name="ID", columnDefinition = "NUMBER", nullable = false)
	int id; 
	@Column(name="MARCA", columnDefinition = "NVARCHAR2(30)", nullable = false)
	String marca;
	@Column(name="MODELO", columnDefinition = "NVARCHAR2(30)", nullable = false)
	String modelo;
	@Column(name="PULGADAS", columnDefinition = "NUMBER", nullable = false)
	double pulgadas;
	@Column(name="COLOR", columnDefinition = "NVARCHAR2(20)", nullable = false)
	String color;
	@Column(name="PRECIO", columnDefinition = "NUMBER", nullable = false)
	double precio;

	public Televisores() {

	}

	public Televisores(int id, String marca, String modelo, double pulgadas, String color, double precio) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.pulgadas = pulgadas;
		this.color = color;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Televisores [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", pulgadas=" + pulgadas
				+ ", color=" + color + ", precio=" + precio + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
