package com.televisores.service;

import java.util.List;

import com.televisores.entity.Televisores;

public interface TelevisoresServ {

	public void guardar(Televisores televisor);
	public void editar(Televisores televisor);
	public void eliminar(Televisores televisor);
	
	public Televisores buscar(Televisores televisor);
	public Televisores buscarXAtributo(Televisores televisor);
	
	public List<Televisores> listar();
	public List<Televisores> listarXatributo(Televisores televisor);
}
