package com.mx.CrudEmpleado.Dominio;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;


import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="DEPARTAMENTO")
public class Departamento {
	/*ID NUMBER PRIMARY KEY NOT NULL,
NOMBRE NVARCHAR2(100),
SUELDO NUMBER,
DESCRIPCION NVARCHAR2(100)*/
	@Id
	@Column (name="ID", columnDefinition="NUMBER",nullable=false)
	int id;
	@Column (name="NOMBRE", columnDefinition="NVARCHAR2(50)",nullable=false)
	String nombre;
	@Column (name="SUELDO", columnDefinition="NUMBER",nullable=false)
	double sueldo;
	@Column (name="DESCRIPCION", columnDefinition="NVARCHAR2(50)",nullable=false)
	String descripcion;
	
	@OneToMany(mappedBy="departamento", cascade=CascadeType.ALL)
	List<Empleado> lista = new ArrayList<Empleado>();

	public Departamento() {
		// TODO Auto-generated constructor stub
	}

	public Departamento(int id) {
		this.id = id;
	}

	public Departamento(int id, String nombre, double sueldo, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + ", descripcion=" + descripcion
				+ "]";
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

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
