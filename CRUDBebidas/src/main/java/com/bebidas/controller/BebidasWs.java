package com.bebidas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bebidas.entidad.Bebidas;
import com.bebidas.servicios.BebidasServ;

@RestController
@RequestMapping("BebidasWs")
@CrossOrigin
public class BebidasWs {

	@Autowired
	BebidasServ bebidasServ;
	
	//localhost:9000/BebidasWs/listar
	@GetMapping("listar")
	public List<Bebidas> listar(){
		return bebidasServ.listar();
	}
	
	//localhost:9000/BebidasWs/buscar
	@PostMapping("buscar")
	public Bebidas buscar(@RequestBody Bebidas bebidas) {
		return bebidasServ.buscar(bebidas);
	}
	
	//localhost:9000/BebidasWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Bebidas bebidas) {
		bebidasServ.guardar(bebidas);
	}
	
	//localhost:9000/BebidasWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Bebidas bebidas) {
		 bebidasServ.editar(bebidas);
	}
	
	//localhost:9000/BebidasWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Bebidas bebidas) {
		bebidasServ.eliminar(bebidas);
	}
	
	
}
