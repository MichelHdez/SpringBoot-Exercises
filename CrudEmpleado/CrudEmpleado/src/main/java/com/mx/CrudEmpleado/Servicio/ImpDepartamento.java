package com.mx.CrudEmpleado.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudEmpleado.Dao.DepartamentoDao;
import com.mx.CrudEmpleado.Dominio.Departamento;

@Service
public class ImpDepartamento implements MetodoDepartamento {

	@Autowired
	DepartamentoDao departamentoDao;

	@Override
	public void guardar(Departamento departamento) {
		departamentoDao.save(departamento);

	}

	@Override
	public void editar(Departamento departamento) {
		departamentoDao.save(departamento);

	}

	@Override
	public void eliminar(Departamento departamento) {
		departamentoDao.delete(departamento);

	}

	@Override
	public Departamento buscar(Departamento departamento) {
		return departamentoDao.findById(departamento.getId()).orElse(null);
	}

	@Override
	public List<Departamento> listar() {
		return (List<Departamento>) departamentoDao.findAll();
	}

}
