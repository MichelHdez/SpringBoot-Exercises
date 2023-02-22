package com.mx.moto.vehiculo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.moto.vehiculo.dominio.Moto;

@Repository
public interface MotoRepository extends JpaRepository<Moto, Integer> {

	List<Moto> findByUsuarioId(int usuarioId);

}
