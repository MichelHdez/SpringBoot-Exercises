package com.mx.ThymeleafBebida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ThymeleafBebida.dominio.Bebida;
import com.mx.ThymeleafBebida.servicios.BebidaServ;

@RestController
@RequestMapping("BebidaWs")
@CrossOrigin
public class BebidaWs {
	@Autowired
	BebidaServ bebidaServ;
	
	@GetMapping("listar")
	public List<Bebida> listar(){
		return bebidaServ.listar();
	}
	
	@PostMapping("buscar")
	public Bebida buscar(@RequestBody Bebida bebida) {
		return bebidaServ.buscar(bebida);
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Bebida bebida) {
		bebidaServ.guardar(bebida);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Bebida bebida) {
		bebidaServ.editar(bebida);
	}
	
	public void eliminar(@RequestBody Bebida bebida) {
		bebidaServ.eliminar(bebida);
	}
	
}
