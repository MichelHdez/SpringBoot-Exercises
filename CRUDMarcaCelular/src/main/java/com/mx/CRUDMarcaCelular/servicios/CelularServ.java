package com.mx.CRUDMarcaCelular.servicios;

import java.util.List;

import com.mx.CRUDMarcaCelular.dominio.Celular;

public interface CelularServ {
	public void guardar(Celular celular);
	public void eliminar(Celular celular);
	public void editar(Celular celular);
	public Celular buscar(Celular celular);
	public List<Celular> listar();
}
