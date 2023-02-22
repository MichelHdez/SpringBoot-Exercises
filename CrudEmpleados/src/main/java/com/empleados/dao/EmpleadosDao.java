package com.empleados.dao;

import org.springframework.data.repository.CrudRepository;

import com.empleados.entidad.Empleados;

public interface EmpleadosDao extends CrudRepository<Empleados, Integer>{

}
