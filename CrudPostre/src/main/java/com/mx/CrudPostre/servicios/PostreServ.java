package com.mx.CrudPostre.servicios;

import java.util.List;

import com.mx.CrudPostre.dominio.Postre;

public interface PostreServ {
	public void guardar(Postre postre);

	public void editar(Postre postre);

	public void eliminar(Postre postre);

	public Postre buscar(Postre postre);

	public List<Postre> listar();
}
