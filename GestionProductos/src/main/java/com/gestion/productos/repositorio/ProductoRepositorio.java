package com.gestion.productos.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.gestion.productos.entidad.Productos;

public interface ProductoRepositorio extends CrudRepository<Productos, Integer>{

}
