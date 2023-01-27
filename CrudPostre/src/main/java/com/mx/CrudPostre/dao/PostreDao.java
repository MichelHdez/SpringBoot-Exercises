package com.mx.CrudPostre.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.CrudPostre.dominio.Postre;

public interface PostreDao extends JpaRepository<Postre, Integer>{

}
