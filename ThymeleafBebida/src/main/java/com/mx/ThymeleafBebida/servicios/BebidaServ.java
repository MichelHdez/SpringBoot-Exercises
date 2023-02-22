package com.mx.ThymeleafBebida.servicios;

import java.util.List;

import com.mx.ThymeleafBebida.dominio.Bebida;

public interface BebidaServ {
	public void guardar(Bebida bebida);
	public void editar(Bebida bebida);
	public void eliminar(Bebida bebida);
	public Bebida buscar(Bebida bebida);
	public List<Bebida> listar();
}
