package com.mx.CRUDMarcaCelular.servicios;

import java.util.List;

import com.mx.CRUDMarcaCelular.dominio.Marca;

public interface MarcaServ {
	public void guardar(Marca marca);
	public void eliminar(Marca marca);
	public void editar(Marca marca);
	public Marca buscar(Marca marca);
	public List<Marca> listar();
}
