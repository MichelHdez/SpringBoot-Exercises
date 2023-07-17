package com.Usuario.servicios;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.Usuario.entidad.Usuario;

public interface Metodos {

	// Aquí implementamos los metodos que vamos a utilizar para nuestro	CRUD
	
	public List<Usuario> listar();
	
	public Page<Usuario> getAll(Pageable pageable);

	public void guardar(Usuario usuario);

	public Usuario buscar(Usuario usuario);

	public void editar(Usuario usuario);

	public void eliminar(Usuario usuario);
}
