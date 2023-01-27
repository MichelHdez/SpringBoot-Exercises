package com.mx.ThymeleafFruta.servicios;

import java.util.List;

import com.mx.ThymeleafFruta.dominio.Fruta;

public interface FrutaServ {
	public void guardar(Fruta fruta);
	public void editar(Fruta fruta);
	public void eliminar(Fruta fruta);
	public Fruta buscar(Fruta fruta);
	public List<Fruta> listar();
}
