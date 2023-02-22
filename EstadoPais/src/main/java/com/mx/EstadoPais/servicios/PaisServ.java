package com.mx.EstadoPais.servicios;

import java.util.List;

import com.mx.EstadoPais.dominio.Pais;

public interface PaisServ {
	public void guardar(Pais pais);
	public void eliminar(Pais pais);
	public void editar(Pais pais);
	public Pais buscar(Pais pais);
	public List<Pais> listar();
}
