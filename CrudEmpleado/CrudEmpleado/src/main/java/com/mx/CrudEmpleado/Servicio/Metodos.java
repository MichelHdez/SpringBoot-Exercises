package com.mx.CrudEmpleado.Servicio;

import java.util.List;

import com.mx.CrudEmpleado.Dominio.Empleado;

public interface Metodos {
	
	public void guardar (Empleado empleado);
	public void editar (Empleado empleado);
	public void eliminar (Empleado empleado);
	public Empleado buscar (Empleado empleado);
	public List <Empleado> listar ();

}
