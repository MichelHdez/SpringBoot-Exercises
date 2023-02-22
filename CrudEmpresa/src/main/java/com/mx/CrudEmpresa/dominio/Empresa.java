package com.mx.CrudEmpresa.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPRESA")
public class Empresa {
	
	/*CREATE TABLE EMPRESA(
    ID NUMBER PRIMARY KEY,
    NOMBRE NVARCHAR2(100),
    TELEFONO NVARCHAR2(100),
    PRECIO NUMBER
	);*/
	
	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String telefono;
	@Column
	double precio;
	
	public Empresa () {
		
	}
	
	public Empresa(int id) {
		this.id=id;
	}

	public Empresa(int id, String nombre, String telefono, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", precio=" + precio + "\n]";
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
