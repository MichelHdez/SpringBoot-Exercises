package com.mx.ThymeleafAnuncio.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.ThymeleafAnuncio.dominio.Anuncio;

public interface AnuncioDao extends CrudRepository<Anuncio,Integer>{

}
