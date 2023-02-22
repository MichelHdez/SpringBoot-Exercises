package com.mx.EstadoPais.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.EstadoPais.dao.EstadoDao;
import com.mx.EstadoPais.dominio.Estado;
@Service
public class EstadoServImp implements EstadoServ{

	@Autowired
	EstadoDao estadoDao;
	@Override
	public void guardar(Estado estado) {
		estadoDao.save(estado);
		
	}

	@Override
	public void eliminar(Estado estado) {
		estadoDao.delete(estado);
		
	}

	@Override
	public void editar(Estado estado) {
		estadoDao.save(estado);
		
	}

	@Override
	public Estado buscar(Estado estado) {
		return estadoDao.findById(estado.getId()).orElse(null);
	}

	@Override
	public List<Estado> listar() {
		return (List<Estado>) estadoDao.findAll();
	}

}
