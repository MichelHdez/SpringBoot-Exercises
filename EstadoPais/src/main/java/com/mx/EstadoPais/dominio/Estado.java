package com.mx.EstadoPais.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ESTADO")
public class Estado {
	/* CREATE TABLE ESTADO(
	   ID NUMBER PRIMARY KEY,
	   NOMBRE NVARCHAR2(100),
	   CAPITAL NVARCHAR2(100),
	   TRADICION NVARCHAR2(100),
	   ID_PAIS NUMBER,
	   FOREIGN KEY(ID_PAIS) REFERENCES PAIS(ID)
	);*/
	
	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String capital;
	@Column
	String tradicion;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_PAIS")
	Pais pais;
	
	public Estado() {
		
	}
	
	public Estado(int id) {
		this.id = id;
	}

	public Estado(int id, String nombre, String capital, String tradicion, Pais pais) {
		this.id = id;
		this.nombre = nombre;
		this.capital = capital;
		this.tradicion = tradicion;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Estado [id=" + id + ", nombre=" + nombre + ", capital=" + capital + ", tradicion=" + tradicion
				+ ", pais=" + pais + "]";
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

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getTradicion() {
		return tradicion;
	}

	public void setTradicion(String tradicion) {
		this.tradicion = tradicion;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	
	
}
