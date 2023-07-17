package com.Usuario.entidad;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

//@Entity mapea la clase para la BD
@Entity
@Table(name = "USUARIO")
public class Usuario {

	//@Id – para especificar la llave primaria de la entidad
	@Id
	/*@Column - para especificar una propiedad de la entidad que 
	coincide con una columna de la tabla de la BD*/
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column()
	int id;
	@Column()
	String nombre;
	@Column()
	String apellido;
	@Column()
	String correo_electronico;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "dd-MM-yyyy", timezone = "Guadalajara/Ciudad de México/Monterrey")
	@Column()
	Date fecha_nacimiento;

	public Usuario() {
	}

	public Usuario(int id, String nombre, String apellido, String correo_electronico, Date fecha_nacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo_electronico = correo_electronico;
		this.fecha_nacimiento = fecha_nacimiento;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo_electronico="
				+ correo_electronico + ", fecha_nacimiento=" + fecha_nacimiento + "]";
	}

}
