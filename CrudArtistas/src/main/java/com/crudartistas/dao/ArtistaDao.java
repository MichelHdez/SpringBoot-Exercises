package com.crudartistas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudartistas.dominio.Artistas;

public interface ArtistaDao extends JpaRepository<Artistas, Integer>{

}
