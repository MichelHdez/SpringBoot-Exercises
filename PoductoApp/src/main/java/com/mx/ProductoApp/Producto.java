package com.mx.ProductoApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTOS_TEST")
public class Producto {

	@Id
	@SequenceGenerator(name="seq",sequenceName="seq_productos_idproducto",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	private Integer id;
	@Column(length=64)
	private String nombre;
	private float precio;
	
	public Producto() {
		
	}

	public Producto(Integer id, String nombre, float precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "\n]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
