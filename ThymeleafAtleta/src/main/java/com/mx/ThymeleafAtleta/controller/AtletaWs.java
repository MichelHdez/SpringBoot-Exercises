package com.mx.ThymeleafAtleta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ThymeleafAtleta.dominio.Atleta;
import com.mx.ThymeleafAtleta.servicios.AtletaServ;

@RestController
@RequestMapping("AtletaWs")
@CrossOrigin
public class AtletaWs {
	@Autowired
	AtletaServ atletaServ;
	
	@GetMapping("listar")
	public List<Atleta> listar(){
		return atletaServ.listar();
	}
	
	@PostMapping("buscar")
	public Atleta buscar(@RequestBody Atleta atleta) {
		return atletaServ.buscar(atleta);
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Atleta atleta) {
		atletaServ.guardar(atleta);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Atleta atleta) {
		atletaServ.editar(atleta);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Atleta atleta) {
		atletaServ.eliminar(atleta);
	}
	
	
}
