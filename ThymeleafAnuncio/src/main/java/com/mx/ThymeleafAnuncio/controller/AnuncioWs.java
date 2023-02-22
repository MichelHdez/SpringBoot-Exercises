package com.mx.ThymeleafAnuncio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ThymeleafAnuncio.dominio.Anuncio;
import com.mx.ThymeleafAnuncio.servicios.AnuncioServ;

@RestController
@RequestMapping("AnuncioWs")
@CrossOrigin
public class AnuncioWs {
	@Autowired
	AnuncioServ anuncioServ;

	//http://localhost:9000/AnuncioWs/listar
	@GetMapping("listar")
	public List<Anuncio> listar() {
		return anuncioServ.listar();
	}

	//http://localhost:9000/AnuncioWs/buscar
	@PostMapping("buscar")
	public Anuncio buscar(@RequestBody Anuncio anuncio) {
		return anuncioServ.buscar(anuncio);
	}

	//http://localhost:9000/AnuncioWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Anuncio anuncio) {
		anuncioServ.guardar(anuncio);
	}

	//http://localhost:9000/AnuncioWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Anuncio anuncio) {
		anuncioServ.editar(anuncio);
	}

	//http://localhost:9000/AnuncioWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Anuncio anuncio) {
		anuncioServ.eliminar(anuncio);
	}

}
