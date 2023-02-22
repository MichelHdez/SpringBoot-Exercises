package com.mx.EstadoPais.servicios;

import java.util.List;

import com.mx.EstadoPais.dominio.Estado;

public interface EstadoServ {
	public void guardar(Estado estado);
	public void eliminar(Estado estado);
	public void editar(Estado estado);
	public Estado buscar(Estado estado);
	public List<Estado> listar();
}
