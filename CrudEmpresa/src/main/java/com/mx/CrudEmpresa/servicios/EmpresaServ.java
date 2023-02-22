package com.mx.CrudEmpresa.servicios;

import java.util.List;

import com.mx.CrudEmpresa.dominio.Empresa;

public interface EmpresaServ {
	public void guardar(Empresa empresa);
	public void editar(Empresa empresa);
	public void eliminar(Empresa empresa);
	public Empresa buscar(Empresa empresa);
	public List<Empresa> listar();
	public List<Empresa> buscarPrecio(Empresa empresa);
	public List<Empresa> buscarTelefono(Empresa empresa);
}
