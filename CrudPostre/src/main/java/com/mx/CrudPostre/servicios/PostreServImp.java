package com.mx.CrudPostre.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudPostre.dao.PostreDao;
import com.mx.CrudPostre.dominio.Postre;

@Service
public class PostreServImp implements PostreServ {

	@Autowired
	PostreDao postreDao;

	public void guardar(Postre postre) {
		postreDao.save(postre);

	}

	@Override
	public void editar(Postre postre) {
		postreDao.save(postre);

	}

	@Override
	public void eliminar(Postre postre) {
		postreDao.delete(postre);

	}

	@Override
	public Postre buscar(Postre postre) {
		return postreDao.findById(postre.getId()).orElse(null);
	}

	@Override
	public List<Postre> listar() {
		return postreDao.findAll();
	}

}
