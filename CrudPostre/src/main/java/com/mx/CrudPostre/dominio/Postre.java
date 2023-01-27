package com.mx.CrudPostre.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "POSTRE")
public class Postre {

	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	double precio;
	@Column
	double calorias;

	public Postre() {

	}

	public Postre(int id) {
		this.id = id;
	}

	public Postre(int id, String nombre, double precio, double calorias) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "Postre [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", calorias=" + calorias + "]";
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

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	

}
