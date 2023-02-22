package com.mx.CrudDulce.servicios;

import java.util.List;

import com.mx.CrudDulce.dominio.Dulce;

public interface DulceServ {

	public void guardar(Dulce dulce);

	public void editar(Dulce dulce);

	public void eliminar(Dulce dulce);

	public Dulce buscar(Dulce dulce);

	public List<Dulce> listar();
}
