package com.mx.CRUDMarcaCelular.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CELULAR")
public class Celular {
	/*
	 * CREATE TABLE CELULAR(
		ID NUMBER PRIMARY KEY,
		MODELO NVARCHAR2(100),
		RAM NUMBER,
		PRECIO NUMBER,
		ID_MARCA NUMBER,
		FOREIGN KEY(ID_MARCA) REFERENCES MARCA(ID)
		);*/
	
		@Id
		@Column
		int id;
		@Column
		String modelo;
		@Column
		int ram;
		@Column
		double precio;
		@ManyToOne(fetch=FetchType.EAGER)//carga los valores en tiempo de ejecución solo en el objeto 
		@JoinColumn(name="ID_MARCA")//Hace relacion con la tabla marca
		Marca marca;
		
		public Celular() {
			
		}
	
		public Celular(int id) {
			this.id = id;
		}

		public Celular(int id, String modelo, int ram, double precio, Marca marca) {
			this.id = id;
			this.modelo = modelo;
			this.ram = ram;
			this.precio = precio;
			this.marca = marca;
		}

		@Override
		public String toString() {
			return "Celular [id=" + id + ", modelo=" + modelo + ", ram=" + ram + ", precio=" + precio + ", marca="
					+ marca + "\n]";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getRam() {
			return ram;
		}

		public void setRam(int ram) {
			this.ram = ram;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public Marca getMarca() {
			return marca;
		}

		public void setMarca(Marca marca) {
			this.marca = marca;
		}
		
}
