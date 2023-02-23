package com.gestion.productos.servicio;

import java.util.List;

import com.gestion.productos.entidad.Productos;

public interface ProductoServ {
	public List<Productos> listar();

	public Productos guardar(Productos producto);

	public Productos buscarById(int id);

	public Productos actualizar(Productos producto);

	public void eliminar(int id);

}
