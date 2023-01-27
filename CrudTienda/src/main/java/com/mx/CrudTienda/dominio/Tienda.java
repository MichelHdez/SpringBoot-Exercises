package com.mx.CrudTienda.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIENDA")
public class Tienda {

	/*
	 * CREATE TABLE TIENDA( ID NUMBER PRIMARY KEY, NOMBRE NVARCHAR2(100), DIRECCION
	 * NVARCHAR2(100), TELEFONO NVARCHAR2(100) );
	 */

	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String direccion;
	@Column
	String telefono;

	public Tienda() {

	}

	public Tienda(int id) {
		this.id = id;
	}

	public Tienda(int id, String nombre, String direccion, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Tienda [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + "]";
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
