package com.gestiontareas.entidad;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "GESTIONTAREAS")
public class Tareas {

	/*
	 * CREATE TABLE GESTIONTAREAS( ID NUMBER PRIMARY KEY NOT NULL, TITULO
	 * NVARCHAR2(100), DESCRIPCION NVARCHAR2(100), FECHACREACION DATE,
	 * FECHAESTIMADATERMINACION DATE, FINALIZADA NVARCHAR2(5), ESTADO NVARCHAR2(30)
	 * );
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gestiontareas_seq")
	@SequenceGenerator(initialValue = 1, name = "gestiontareas_seq", sequenceName = "gestiontareas_seq", allocationSize = 1)
	@Column(name = "ID")
	int id;

	@Column(name = "TITULO", columnDefinition = "NVARCHAR2(100)", nullable = false)
	String titulo;

	@Column(name = "DESCRIPCION", columnDefinition = "NVARCHAR2(100)", nullable = false)
	String descripcion;

	@Column(name = "FECHACREACION")
	@DateTimeFormat(iso = ISO.DATE)
	@Temporal(TemporalType.DATE)
	Date fechacreacion;

	@Column(name = "FECHAESTIMADATERMINACION")
	@DateTimeFormat(iso = ISO.DATE)
	@Temporal(TemporalType.DATE)
	Date fechaestimadaterminacion;

	@Column(name = "FINALIZADA", columnDefinition = "NVARCHAR2(5)", nullable = false)
	String finalizada;

	@Column(name = "ESTADO", columnDefinition = "NVARCHAR2(30)", nullable = false)
	String estado;

	public Tareas() {
	}

	public Tareas(String estado) {
		this.estado = estado;
	}

	public Tareas(int id, String titulo, String descripcion, Date fechacreacion, Date fechaestimadaterminacion,
			String finalizada, String estado) {
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechacreacion = fechacreacion;
		this.fechaestimadaterminacion = fechaestimadaterminacion;
		this.finalizada = finalizada;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Tareas [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fechacreacion="
				+ fechacreacion + ", fechaestimadaterminacion=" + fechaestimadaterminacion + ", finalizada="
				+ finalizada + ", estado=" + estado + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFechaestimadaterminacion() {
		return fechaestimadaterminacion;
	}

	public void setFechaestimadaterminacion(Date fechaestimadaterminacion) {
		this.fechaestimadaterminacion = fechaestimadaterminacion;
	}

	public String getFinalizada() {
		return finalizada;
	}

	public void setFinalizada(String finalizada) {
		this.finalizada = finalizada;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
