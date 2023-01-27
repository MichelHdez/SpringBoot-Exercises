package com.mx.ThymeleafFruta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ThymeleafFruta.dominio.Fruta;
import com.mx.ThymeleafFruta.servicios.FrutaServ;

@RestController
@RequestMapping("FrutaWs")
@CrossOrigin
public class FrutaWs {
	@Autowired
	FrutaServ frutaServ;
	
	@GetMapping("listar")
	public List<Fruta> listar(){
		return frutaServ.listar();
	}
	
	@PostMapping("buscar")
	public Fruta buscar(@RequestBody Fruta fruta) {
		return frutaServ.buscar(fruta);
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Fruta fruta) {
		frutaServ.guardar(fruta);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Fruta fruta) {
		frutaServ.editar(fruta);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Fruta fruta) {
		frutaServ.eliminar(fruta);
	}
	
	
}
