package com.bebidas.servicios;

import java.util.List;

import com.bebidas.entidad.Bebidas;

public interface BebidasServ {

	public void guardar(Bebidas bebidas);

	public void eliminar(Bebidas bebidas);

	public void editar(Bebidas bebidas);

	public Bebidas buscar(Bebidas bebidas);

	public List<Bebidas> listar();
}
