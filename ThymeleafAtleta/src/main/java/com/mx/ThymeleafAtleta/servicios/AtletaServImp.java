package com.mx.ThymeleafAtleta.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.ThymeleafAtleta.dao.AtletaDao;
import com.mx.ThymeleafAtleta.dominio.Atleta;

@Service
public class AtletaServImp implements AtletaServ{

	@Autowired
	private AtletaDao atletaDao;
	
	@Override
	public void guardar(Atleta atleta) {
		atletaDao.save(atleta);
		
	}

	@Override
	public void editar(Atleta atleta) {
		atletaDao.save(atleta);
		
	}

	@Override
	public void eliminar(Atleta atleta) {
		atletaDao.delete(atleta);
		
	}

	@Override
	public Atleta buscar(Atleta atleta) {
		return atletaDao.findById(atleta.getId()).orElse(null);
	}

	@Override
	public List<Atleta> listar() {
		return (List<Atleta>) atletaDao.findAll();
	}

}
