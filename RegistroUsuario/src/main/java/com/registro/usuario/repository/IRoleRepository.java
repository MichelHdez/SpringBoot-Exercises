package com.registro.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.usuario.model.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long>{

}
