package com.mx.EstadoPais.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.EstadoPais.dominio.Estado;
import com.mx.EstadoPais.servicios.EstadoServ;

@RestController
@RequestMapping("EstadoWs")
@CrossOrigin
public class EstadoWs {
	
	@Autowired
	EstadoServ estadoServ;
	
	//http://localhost:9000/EstadoWs/listar
	@GetMapping("listar")
	public List<Estado> listar(){
		var lista=estadoServ.listar();
		return lista;
	}
	
	//http://localhost:9000/EstadoWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Estado estado) {
		estadoServ.guardar(estado);
	}
	
	//http://localhost:9000/EstadoWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Estado estado) {
		estadoServ.editar(estado);
	}
	
	//http://localhost:9000/EstadoWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Estado estado) {
		estadoServ.eliminar(estado);
	}
	
	//http://localhost:9000/EstadoWs/buscar
	@PostMapping("buscar")
	public Estado buscar(@RequestBody Estado estado) {
		estado=estadoServ.buscar(estado);
		return estado;
	}
}
