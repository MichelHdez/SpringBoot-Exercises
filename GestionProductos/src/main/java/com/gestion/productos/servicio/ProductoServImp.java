package com.gestion.productos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.productos.entidad.Productos;
import com.gestion.productos.repositorio.ProductoRepositorio;

@Service
public class ProductoServImp implements ProductoServ {

	@Autowired
	private ProductoRepositorio productoRepositorio;

	@Override
	public List<Productos> listar() {
		return (List<Productos>) productoRepositorio.findAll();
	}

	@Override
	public Productos guardar(Productos producto) {
		return productoRepositorio.save(producto);
	}

	@Override
	public Productos buscarById(int id) {
		return productoRepositorio.findById(id).get();
	}

	@Override
	public Productos actualizar(Productos producto) {
		return productoRepositorio.save(producto);
	}

	@Override
	public void eliminar(int id) {
		productoRepositorio.deleteById(id);

	}

}
