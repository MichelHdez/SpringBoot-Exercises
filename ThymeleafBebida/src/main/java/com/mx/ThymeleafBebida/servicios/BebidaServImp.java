package com.mx.ThymeleafBebida.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.ThymeleafBebida.dao.BebidaDao;
import com.mx.ThymeleafBebida.dominio.Bebida;

@Service
public class BebidaServImp implements BebidaServ{

	@Autowired
	private BebidaDao bebidaDao;
	
	public void guardar(Bebida bebida) {
		bebidaDao.save(bebida);
		
	}

	@Override
	public void editar(Bebida bebida) {
		bebidaDao.save(bebida);
		
	}

	@Override
	public void eliminar(Bebida bebida) {
		bebidaDao.delete(bebida);
		
	}

	@Override
	public Bebida buscar(Bebida bebida) {
		return bebidaDao.findById(bebida.getId()).orElse(null);
	}

	@Override
	public List<Bebida> listar() {
		return (List<Bebida>) bebidaDao.findAll();
	}

}
