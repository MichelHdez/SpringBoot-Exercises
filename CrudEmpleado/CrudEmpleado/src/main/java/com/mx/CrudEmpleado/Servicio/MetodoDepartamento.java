package com.mx.CrudEmpleado.Servicio;

import java.util.List;

import com.mx.CrudEmpleado.Dominio.Departamento;

public interface MetodoDepartamento {
	
	public void guardar (Departamento departamento);
	public void editar (Departamento departamento);
	public void eliminar (Departamento departamento);
	public Departamento buscar (Departamento departamento);
	public List <Departamento> listar ();
	

}
