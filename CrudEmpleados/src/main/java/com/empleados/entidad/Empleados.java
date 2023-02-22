package com.empleados.entidad;

import java.time.format.DateTimeFormatter;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLEADOS")
public class Empleados {

	/*
	 * CREATE TABLE EMPLEADOS( ID NUMBER PRIMARY KEY NOT NULL, NUMEROEMPLEADO
	 * NUMBER, NOMBRE NVARCHAR2(100), FECHANACIMIENTO DATE, TELEFONO NUMBER, ESTATUS
	 * NUMBER );
	 * 
	 * NumeroEmpleado, tamaño a 6 NombreCompletoEmpleado, tamaño a 100
	 * FechaNacimiento NoCelular, tamaño a 10 Estatus, 1 activo - 0 inactivo – BD
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", columnDefinition = "NUMBER", nullable = false)
	int id;
	@Column(name = "NUMEROEMPLEADO", columnDefinition = "NUMBER(6,0)", nullable = false)
	int numeroempleado;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(100)", nullable = false)
	String nombre;
	//@JsonFormat(pattern = "dd-MM-yyyy", shape = Shape.STRING)
	//@DateTimeFormat(pattern = "dd-MM-yyyy", shape = Shape.STRING)
	@Column(name = "FECHANACIMIENTO",columnDefinition = "NUMBER", nullable = false)
	String fechanacimiento;
	@Column(name = "TELEFONO", columnDefinition = "NUMBER(10,0)", nullable = false)
	int telefono;
	@Column(name = "ESTATUS", columnDefinition = "NUMBER(1,0)", nullable = false)
	int estatus;

	public Empleados() {
	}

	public Empleados(int id, int numeroempleado, String nombre, String fechanacimiento, int telefono, int estatus) {
		this.id = id;
		this.numeroempleado = numeroempleado;
		this.nombre = nombre;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
		this.estatus = estatus;
	}

	

	@Override
	public String toString() {
		return "Empleados [id=" + id + ", numeroempleado=" + numeroempleado + ", nombre=" + nombre
				+ ", fechanacimiento=" + fechanacimiento + ", telefono=" + telefono + ", estatus=" + estatus + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroempleado() {
		return numeroempleado;
	}

	public void setNumeroempleado(int numeroempleado) {
		this.numeroempleado = numeroempleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}


}
