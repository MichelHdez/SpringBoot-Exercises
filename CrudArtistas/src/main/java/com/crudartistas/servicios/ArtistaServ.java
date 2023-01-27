package com.crudartistas.servicios;

import java.util.List;

import com.crudartistas.dominio.Artistas;

public interface ArtistaServ {
	public void guardar(Artistas artistas);

	public void editar(Artistas artistas);

	public void eliminar(Artistas artistas);

	public Artistas buscar(Artistas artistas);

	public List<Artistas> listar();
}
