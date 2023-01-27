package com.crudartistas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crudartistas.dao.ArtistaDao;
import com.crudartistas.dominio.Artistas;
@Service
public class ArtistaServImp implements ArtistaServ{

	@Autowired
	private ArtistaDao artistaDao;
	
	
	@Transactional
	public void guardar(Artistas artistas) {
		artistaDao.save(artistas);
		
	}

	@Transactional
	public void editar(Artistas artistas) {
		artistaDao.save(artistas);
		
	}

	@Transactional
	public void eliminar(Artistas artistas) {
		artistaDao.delete(artistas);
		
	}

	@Transactional(readOnly=true)
	public Artistas buscar(Artistas artistas) {
		return artistaDao.findById(artistas.getId()).orElse(null);
	}

	@Transactional(readOnly=true)
	public List<Artistas> listar() {
		return artistaDao.findAll();
	}

}
