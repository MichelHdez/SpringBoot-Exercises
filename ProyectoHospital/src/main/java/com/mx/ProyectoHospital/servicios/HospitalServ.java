package com.mx.ProyectoHospital.servicios;

import java.util.List;

import com.mx.ProyectoHospital.dominio.Hospital;

public interface HospitalServ {
	public void guardar(Hospital hospital);
	public void editar(Hospital hospital);
	public void eliminar(Hospital hospital);
	public Hospital buscar(Hospital hospital);
	public List<Hospital> listar();
}
