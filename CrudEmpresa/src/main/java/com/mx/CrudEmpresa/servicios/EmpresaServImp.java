package com.mx.CrudEmpresa.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudEmpresa.dao.EmpresaDao;
import com.mx.CrudEmpresa.dominio.Empresa;

@Service//tenemos una capa de servicio o presentacion de datos(lógica)
public class EmpresaServImp implements EmpresaServ{
	
	@Autowired
	EmpresaDao empresaDao;
	public void guardar(Empresa empresa) {
		empresaDao.save(empresa);
		
	}

	@Override
	public void editar(Empresa empresa) {
		empresaDao.save(empresa);
		
	}

	@Override
	public void eliminar(Empresa empresa) {
		empresaDao.delete(empresa);
		
	}

	@Override
	public Empresa buscar(Empresa empresa) {
		return empresaDao.findById(empresa.getId()).orElse(null);
	}

	@Override
	public List<Empresa> listar() {
		return empresaDao.findAll();
	}

	@Override
	public List<Empresa> buscarPrecio(Empresa empresa) {
		var lista = empresaDao.findByPrecio(empresa.getPrecio());
		return lista;
	}

	@Override
	public List<Empresa> buscarTelefono(Empresa empresa) {
		var lista=empresaDao.findByTelefono(empresa.getTelefono());
		return lista;
	}

}
