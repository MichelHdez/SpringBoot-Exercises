package com.gestiontareas.servicios;

import java.util.List;

import com.gestiontareas.entidad.Tareas;

public interface TareasServ {
	public void guardar(Tareas tareas);

	public void editar(Tareas tareas);

	public void eliminar(Tareas tareas);

	public Tareas buscar(Tareas tareas);

	public List<Tareas> listar();
	
	//buscar por estado
	//public Tareas findByEstado(String estado);
	
	public List<Tareas> findByEstado(Tareas tareas);
}
