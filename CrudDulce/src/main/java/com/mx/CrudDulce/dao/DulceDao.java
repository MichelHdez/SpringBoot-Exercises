package com.mx.CrudDulce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.CrudDulce.dominio.Dulce;

public interface DulceDao extends JpaRepository<Dulce, Integer>{

}
