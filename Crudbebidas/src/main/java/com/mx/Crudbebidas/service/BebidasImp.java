package com.mx.Crudbebidas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Crudbebidas.dao.BebidasDao;
import com.mx.Crudbebidas.entity.Bebidas;

@Service
public class BebidasImp implements Metodos{
	
	@Autowired
	BebidasDao bebidasDao;

	@Override
	public void guardar(Bebidas bebida) {
		// TODO Auto-generated method stub
	List<Bebidas> lista = new ArrayList<Bebidas>();
		lista = (List<Bebidas>) bebidasDao.findAll();
		System.out.println("lista de bebidas -->"+lista);
		
		if(lista.isEmpty()) {
			System.out.println("la lista esta vacia");
			bebidasDao.save(bebida);
		}else {
			for(Bebidas b : lista) {
				if(b.getNombre().equals(bebida.getNombre())) {
					System.out.println("la bebida ya existe");
				}else {
					bebidasDao.save(bebida);
				}
			}
		}
	
	}

	@Override
	public void editar(Bebidas bebida) {
		// TODO Auto-generated method stub
		bebidasDao.save(bebida);
	}

	@Override
	public void eliminar(Bebidas bebida) {
		// TODO Auto-generated method stub
		bebidasDao.delete(bebida);
	}

	@Override
	public Bebidas buscar(Bebidas bebida) {
		// TODO Auto-generated method stub
		return bebidasDao.findById(bebida.getId()).orElse(null) ;
	}

	@Override
	public Bebidas buscarXAtributo(Bebidas bebida) {
		// TODO Auto-generated method stub
		Bebidas bebidas = new Bebidas();
		for(Bebidas b :bebidasDao.findAll() ) {
			if(b.getId() == bebida.getId()) {
				bebidas = b;
			}
			if(b.getNombre().equals(bebida.getNombre())) {
				bebidas = b;
			}
		}
		
		return bebidas;
	}

	@Override
	public List<Bebidas> listar() {
		// TODO Auto-generated method stub
		return (List<Bebidas>) bebidasDao.findAll() ;
	}

	@Override
	public List<Bebidas> listarXatributo(Bebidas bebida) {
		// TODO Auto-generated method stub
		List<Bebidas> listaB = new ArrayList<Bebidas>();
		for(Bebidas b :bebidasDao.findAll() ) {
			if(b.getId() == bebida.getId()) {
				listaB.add(b);
			}
			if(b.getNombre().equals(bebida.getNombre())) {
				listaB.add(b);
			}
		}
		return listaB;
	}

}
