package com.registro.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.usuario.model.Users;

@Repository
public interface IUsersRepository extends JpaRepository<Users, Long>{
	Users findByUsername(String username);
}
