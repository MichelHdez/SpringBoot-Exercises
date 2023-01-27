package com.reportes.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "REPORTES")
public class Reportes {

	/*
	 * CREATE TABLE REPORTES( ID NUMBER PRIMARY KEY NOT NULL, ITEM NVARCHAR2(50),
	 * PADRE NUMBER(30), ACCESO NUMBER, RUTA NVARCHAR2(100) );
	 */

	@Id
	@Column(name="ID", columnDefinition = "NUMBER", nullable = false)
	int id;
	@Column(name="ITEM", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String item;
	@Column(name="PADRE", columnDefinition = "NUMBER", nullable = false)
	double padre;
	@Column(name="ACCESO", columnDefinition = "NUMBER", nullable = false)
	double acceso;
	@Column(name="RUTA", columnDefinition = "NVARCHAR2(100)", nullable = false)
	String ruta;

	public Reportes() {

	}
	
	public Reportes(int id, String item, double padre, double acceso, String ruta) {
		this.id = id;
		this.item = item;
		this.padre = padre;
		this.acceso = acceso;
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Reportes [id=" + id + ", item=" + item + ", padre=" + padre + ", acceso=" + acceso + ", ruta=" + ruta
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPadre() {
		return padre;
	}

	public void setPadre(double padre) {
		this.padre = padre;
	}

	public double getAcceso() {
		return acceso;
	}

	public void setAcceso(double acceso) {
		this.acceso = acceso;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

}
