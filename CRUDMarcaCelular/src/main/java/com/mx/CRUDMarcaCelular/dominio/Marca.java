package com.mx.CRUDMarcaCelular.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MARCA")
public class Marca {

	/*
	 * CREATE TABLE MARCA(
		ID NUMBER PRIMARY KEY,
		NOMBRE NVARCHAR2(100) UNIQUE,
		PAIS NVARCHAR2(100),
		CHECK (PAIS IN ('USA','CHINA','JAPON'))
		);
	 * */
	
		@Id
		@Column
		int id;
		@Column
		String nombre;
		@Column
		String pais;
		
		@OneToMany(mappedBy="marca",cascade=CascadeType.ALL)
		List<Celular> lista = new ArrayList<Celular>();
		
		public Marca() {
			
		}
		
		public Marca(int id) {
			this.id = id;
		}

		public Marca(int id, String nombre, String pais) {
			this.id = id;
			this.nombre = nombre;
			this.pais = pais;
		}

		@Override
		public String toString() {
			return "Marca [id=" + id + ", nombre=" + nombre + ", pais=" + pais + "]";
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

		public String getPais() {
			return pais;
		}

		public void setPais(String pais) {
			this.pais = pais;
		}		
		
}
