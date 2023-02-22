package com.mx.CrudEmpresa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.CrudEmpresa.dominio.Empresa;

public interface EmpresaDao extends JpaRepository<Empresa,Integer>{
	public List<Empresa> findByPrecio(double precio);
	public List<Empresa> findByTelefono(String telefono);
}
