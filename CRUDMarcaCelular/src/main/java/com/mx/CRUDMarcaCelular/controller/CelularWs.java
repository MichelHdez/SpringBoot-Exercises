package com.mx.CRUDMarcaCelular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CRUDMarcaCelular.dominio.Celular;
import com.mx.CRUDMarcaCelular.servicios.CelularServ;

@RestController
@RequestMapping("CelularWs")
@CrossOrigin
public class CelularWs {
	
	@Autowired
	CelularServ celularServ;
	
	//http://localhost:9000/CelularWs/listar
	@GetMapping("listar")
	public List<Celular> listar(){
		var lista = celularServ.listar();
		return lista;
	}
	
	//http://localhost:9000/CelularWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Celular celular) {
		celularServ.guardar(celular);
	}
	
	//http://localhost:9000/CelularWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Celular celular) {
		celularServ.editar(celular);
	}
	
	//http://localhost:9000/CelularWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Celular celular) {
		celularServ.eliminar(celular);
	}
	
	//http://localhost:9000/CelularWs/buscar
	@PostMapping("buscar")
	public Celular buscar(@RequestBody Celular celular) {
		celular = celularServ.buscar(celular);
		return celular;
	}
}
