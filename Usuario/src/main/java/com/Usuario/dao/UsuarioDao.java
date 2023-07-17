package com.Usuario.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Usuario.entidad.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Integer>{

//	Page<Usuario> findAll(Pageable pageable);

}
