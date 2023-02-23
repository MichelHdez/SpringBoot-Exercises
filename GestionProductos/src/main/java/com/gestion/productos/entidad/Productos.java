package com.gestion.productos.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre", nullable = false, length = 60)
	private String nombre;
	@Column(name = "marca", nullable = false, length = 40)
	private String marca;
	@Column(name = "hechoEn", nullable = false, length = 40)
	private String hechoEn;
	@Column(name = "precio", nullable = false, length = 20)
	private int precio;

	public Productos() {

	}

	public Productos(int id, String nombre, String marca, String hechoEn, int precio) {
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.hechoEn = hechoEn;
		this.precio = precio;
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

	public String getHechoEn() {
		return hechoEn;
	}

	public void setHechoEn(String hechoEn) {
		this.hechoEn = hechoEn;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
