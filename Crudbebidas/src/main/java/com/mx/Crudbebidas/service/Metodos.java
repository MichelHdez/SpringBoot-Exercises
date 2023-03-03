package com.mx.Crudbebidas.service;

import java.util.List;

import com.mx.Crudbebidas.entity.Bebidas;

public interface Metodos {
	
	public void guardar(Bebidas bebida);
	public void editar(Bebidas bebida);
	public void eliminar(Bebidas bebida);
	
	public Bebidas buscar(Bebidas bebida);
	public Bebidas buscarXAtributo(Bebidas bebida);
	
	public List<Bebidas> listar();
	public List<Bebidas> listarXatributo(Bebidas bebida);

}
