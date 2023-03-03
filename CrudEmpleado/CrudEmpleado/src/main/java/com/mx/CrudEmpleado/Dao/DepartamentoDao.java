package com.mx.CrudEmpleado.Dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudEmpleado.Dominio.Departamento;

public interface DepartamentoDao extends CrudRepository <Departamento, Integer> {

}
