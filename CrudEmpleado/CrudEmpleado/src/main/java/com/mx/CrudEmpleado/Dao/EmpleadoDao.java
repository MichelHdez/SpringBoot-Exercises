package com.mx.CrudEmpleado.Dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudEmpleado.Dominio.Empleado;

public interface EmpleadoDao extends CrudRepository <Empleado,Integer> {

}
