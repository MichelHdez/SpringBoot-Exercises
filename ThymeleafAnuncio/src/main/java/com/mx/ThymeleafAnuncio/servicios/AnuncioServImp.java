package com.mx.ThymeleafAnuncio.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.ThymeleafAnuncio.dao.AnuncioDao;
import com.mx.ThymeleafAnuncio.dominio.Anuncio;
@Service
public class AnuncioServImp implements AnuncioServ{

	@Autowired
	private AnuncioDao anuncioDao;
	
	public void guardar(Anuncio anuncio) {
		anuncioDao.save(anuncio);
	}

	@Override
	public void editar(Anuncio anuncio) {
		anuncioDao.save(anuncio);
		
	}

	@Override
	public void eliminar(Anuncio anuncio) {
		anuncioDao.delete(anuncio);
		
	}

	@Override
	public Anuncio buscar(Anuncio anuncio) {
		return anuncioDao.findById(anuncio.getId()).orElse(null);
	}

	@Override
	public List<Anuncio> listar() {
		return (List<Anuncio>) anuncioDao.findAll();
	}

}
