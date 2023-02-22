package com.televisores.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.televisores.dao.TelevisoresDao;
import com.televisores.entity.Televisores;

@Service
public class TelevisoresServImp implements TelevisoresServ{

	@Autowired
	TelevisoresDao televisoresDao;
	@Override
	public void guardar(Televisores televisor) {
		List<Televisores> lista = new ArrayList<Televisores>();
		lista = (List<Televisores>) televisoresDao.findAll();
		System.out.println("lista de televisores -->"+lista);
		
		if(lista.isEmpty()) {
			System.out.println("la lista esta vacia");
			televisoresDao.save(televisor);
		}else {
			for(Televisores t : lista) {
				if(t.getMarca().equals(televisor.getMarca())) {
					System.out.println("El televisor ya existe");
				} else {
					televisoresDao.save(televisor);
				}
			}
		}
	}
	
	@Override
	public void editar(Televisores televisor) {
		televisoresDao.save(televisor);
	}

	@Override
	public void eliminar(Televisores televisor) {
		televisoresDao.delete(televisor);
	}

	@Override
	public Televisores buscar(Televisores televisor) {
		return televisoresDao.findById(televisor.getId()).orElse(null);
	}

	@Override
	public Televisores buscarXAtributo(Televisores televisor) {
		Televisores televisores = new Televisores();
		for(Televisores t : televisoresDao.findAll()) {
			if(t.getId() == televisor.getId()) {
				televisores = t;
			}
			if(t.getMarca().equals(televisor.getMarca())) {
				televisores = t;
			}
		}
		return televisores;
	}

	@Override
	public List<Televisores> listar() {
		return (List<Televisores>) televisoresDao.findAll();
	}

	@Override
	public List<Televisores> listarXatributo(Televisores televisor) {
		List<Televisores> listaT = new ArrayList<Televisores>();
		for(Televisores t : televisoresDao.findAll() ) {
			//Dato de la BD -- Dato del cliente
			if(t.getId() == televisor.getId()) {
				listaT.add(t);
			}
			if(t.getMarca().equals(televisor.getMarca())) {
				listaT.add(t);
			}
		}
		return listaT;
	}
}
