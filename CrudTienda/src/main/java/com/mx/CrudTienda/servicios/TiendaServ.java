package com.mx.CrudTienda.servicios;

import java.util.List;

import com.mx.CrudTienda.dominio.Tienda;

public interface TiendaServ {
	public void guardar(Tienda tienda);

	public void editar(Tienda tienda);

	public void eliminar(Tienda tienda);

	public Tienda buscar(Tienda tienda);

	public List<Tienda> listar();

	public List<Tienda> buscarDireccion(Tienda tienda);

	public List<Tienda> buscarTelefono(Tienda tienda);
}
