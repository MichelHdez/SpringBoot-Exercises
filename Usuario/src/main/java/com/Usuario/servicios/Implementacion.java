package com.Usuario.servicios;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.Usuario.dao.UsuarioDao;
import com.Usuario.entidad.Usuario;

// @Service para la lógica de negocio
@Service
public class Implementacion implements Metodos {

	/*
	 * Utilizamos @Autowired ya que es una forma de inyectar instancias o los
	 * atributos de esas instancias para evitar instanciarlas con new
	 * 
	 */

	@Autowired
	UsuarioDao dao;

	@Override
	public List<Usuario> listar() {
		return (List<Usuario>) dao.findAll();
	}

	@Override
	public void guardar(Usuario usuario) {
		dao.save(usuario);

	}

	@Override
	public Usuario buscar(Usuario usuario) {
		return dao.findById(usuario.getId()).orElse(usuario);
	}

	@Override
	public void editar(Usuario usuario) {
		dao.save(usuario);
	}

	@Override
	public void eliminar(Usuario usuario) {
		dao.delete(usuario);

	}

	@Override
	public Page<Usuario> getAll(org.springframework.data.domain.Pageable pageable) {
		return dao.findAll(pageable);
	}

}
