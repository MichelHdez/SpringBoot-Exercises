package com.mx.EstadoPais.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.EstadoPais.dominio.Estado;

public interface EstadoDao extends CrudRepository<Estado, Integer> {

}
