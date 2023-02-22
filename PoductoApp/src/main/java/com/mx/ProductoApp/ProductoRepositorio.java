package com.mx.ProductoApp;

import org.springframework.data.repository.CrudRepository;

public interface ProductoRepositorio extends CrudRepository<Producto, Integer>{
	public Producto findByNombre(String nombre);//Spring entiende que estas buscando el valor por nombre
}
