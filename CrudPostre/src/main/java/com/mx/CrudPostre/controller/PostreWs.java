package com.mx.CrudPostre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudPostre.dominio.Postre;
import com.mx.CrudPostre.servicios.PostreServ;

@RestController
@RequestMapping("PostreWs")
@CrossOrigin
public class PostreWs {

	@Autowired
	PostreServ postreServ;
	
	//http://localhost:9000/PostreWs/listar
	@GetMapping("listar")
	public List<Postre> listar(){
		var lista = postreServ.listar();
		return lista;
	}
	
	//http://localhost:9000/PostreWs/buscar
	@PostMapping("buscar")
	public Postre buscar(@RequestBody Postre postre) {
		postre = postreServ.buscar(postre);
		return postre;
	}
	
	//http://localhost:9000/PostreWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Postre postre) {
		System.out.println("Postre a guardar---> " + postre);
		postreServ.guardar(postre);
	}
	
	//http://localhost:9000/PostreWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Postre postre) {
		postreServ.editar(postre);
	}
	
	//http://localhost:9000/PostreWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Postre postre) {
		postreServ.eliminar(postre);
	}
	
}
