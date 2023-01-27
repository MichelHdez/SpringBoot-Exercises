package com.reportes.servicios;

import java.util.List;

import com.reportes.entidad.Reportes;

public interface ReportesServ {

	public void guardar(Reportes reportes);

	public void editar(Reportes reportes);

	public void eliminar(Reportes reportes);

	public Reportes buscar(Reportes reportes);

	public List<Reportes> listar();

}
