package com.mx.ThymeleafAnuncio.servicios;

import java.util.List;

import com.mx.ThymeleafAnuncio.dominio.Anuncio;

public interface AnuncioServ {
	public void guardar(Anuncio anuncio);

	public void editar(Anuncio anuncio);

	public void eliminar(Anuncio anuncio);

	public Anuncio buscar(Anuncio anuncio);

	public List<Anuncio> listar();
}
