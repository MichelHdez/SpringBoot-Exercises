package com.crudartistas.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ARTISTAS")
public class Artistas {

	/*
	 * CREATE TABLE ARTISTAS( ID NUMBER PRIMARY KEY, NOMBRE NVARCHAR2(100),
	 * PAISORIGEN NVARCHAR2(60), GENERO NVARCHAR2(50), EDAD NUMBER, ALBUMES NUMBER
	 * );
	 */

	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String paisorigen;
	@Column
	String genero;
	@Column
	int edad;
	@Column
	int albumes;

	public Artistas() {

	}

	public Artistas(int id) {
		this.id = id;
	}

	public Artistas(int id, String nombre, String paisorigen, String genero, int edad, int albumes) {
		this.id = id;
		this.nombre = nombre;
		this.paisorigen = paisorigen;
		this.genero = genero;
		this.edad = edad;
		this.albumes = albumes;
	}

	@Override
	public String toString() {
		return "Artista [id=" + id + ", nombre=" + nombre + ", paisorigen=" + paisorigen + ", genero=" + genero
				+ ", edad=" + edad + ", albumes=" + albumes + "]\n";
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

	public String getPaisorigen() {
		return paisorigen;
	}

	public void setPaisorigen(String paisorigen) {
		this.paisorigen = paisorigen;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAlbumes() {
		return albumes;
	}

	public void setAlbumes(int albumes) {
		this.albumes = albumes;
	}

}
