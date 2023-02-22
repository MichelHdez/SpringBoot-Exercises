package com.mx.CrudRopa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.CrudRopa.dominio.Ropa;

public interface RopaDao extends JpaRepository<Ropa, Integer> {

}
