package com.mx.CrudTienda.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.CrudTienda.dominio.Tienda;

public interface TiendaDao extends JpaRepository<Tienda, Integer> {
	public List<Tienda> findByDireccion(String direccion);

	public List<Tienda> findByTelefono(String telefono);
}
