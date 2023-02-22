package com.mx.CRUDMarcaCelular.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CRUDMarcaCelular.dominio.Marca;

public interface MarcaDao extends CrudRepository<Marca, Integer>{

}
