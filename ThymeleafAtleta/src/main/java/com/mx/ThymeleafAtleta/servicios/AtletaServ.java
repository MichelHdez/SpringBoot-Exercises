package com.mx.ThymeleafAtleta.servicios;

import java.util.List;

import com.mx.ThymeleafAtleta.dominio.Atleta;

public interface AtletaServ {
	public void guardar(Atleta atleta);
	public void editar(Atleta atleta);
	public void eliminar(Atleta atleta);
	public Atleta buscar(Atleta atleta);
	public List<Atleta> listar();
}
