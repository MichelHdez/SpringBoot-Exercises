package com.mx.CrudClientes.dao;

import com.mx.CrudClientes.dominio.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpleadosDAO extends JpaRepository<Empleados,Integer> {
    //Empleados findByNombre(String nombre);
    List<Empleados> findByNombre (String nombre);
}

