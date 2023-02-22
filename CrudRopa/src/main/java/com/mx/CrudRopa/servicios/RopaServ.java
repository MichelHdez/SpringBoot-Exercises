package com.mx.CrudRopa.servicios;

import java.util.List;

import com.mx.CrudRopa.dominio.Ropa;

public interface RopaServ {
	public void guardar(Ropa ropa);
	public void editar (Ropa ropa);
	public void eliminar (Ropa ropa);
	public Ropa buscar(Ropa ropa);
	public List<Ropa> listar();
}
