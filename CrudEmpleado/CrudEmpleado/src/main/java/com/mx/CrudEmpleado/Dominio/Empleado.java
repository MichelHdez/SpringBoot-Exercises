package com.mx.CrudEmpleado.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name="EMPLEADO_AN")
public class Empleado {

	/*ID NUMBER PRIMARY KEY NOT NULL,
NOMBRE NVARCHAR2(50),
APP NVARCHAR2(50),
GENERO NVARCHAR2(50),
CORREO NVARCHAR2(50),
TELEFONO NVARCHAR2(50));*/
	@Id
	@Column (name="ID", columnDefinition="NUMBER",nullable=false)
	int id;
	@Column (name="NOMBRE", columnDefinition="NVARCHAR2(50)",nullable=false)
	String nombre;
	@Column (name="APP", columnDefinition="NVARCHAR2(50)",nullable=false)
	String app;
	@Column (name="GENERO", columnDefinition="NVARCHAR2(50)",nullable=false)
	String genero;
	@Column (name="CORREO", columnDefinition="NVARCHAR2(50)",nullable=false)
	String correo;
	@Column (name="TELEFONO", columnDefinition="NVARCHAR2(50)",nullable=false)
	String telefono;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ID_DEPARTAMENTO")
	Departamento departamento;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(int id) {
		this.id = id;
	}

	public Empleado(int id, String nombre, String app, String genero, String correo, String telefono,
			Departamento departamento) {
		this.id = id;
		this.nombre = nombre;
		this.app = app;
		this.genero = genero;
		this.correo = correo;
		this.telefono = telefono;
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", app=" + app + ", genero=" + genero + ", correo="
				+ correo + ", telefono=" + telefono + ", departamento=" + departamento + "]";
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

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

		
}
