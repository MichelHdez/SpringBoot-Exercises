package com.crudartistas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudartistas.dominio.Artistas;
import com.crudartistas.servicios.ArtistaServ;

@RestController
@RequestMapping("ArtistaWs")
@Controller
public class ArtistaWs {

	@Autowired
	ArtistaServ artistaServ;

	//http://localhost:9000/ArtistaWs/listar
	@GetMapping("listar")
	public List<Artistas> listar() {
		return artistaServ.listar();
	}

	//http://localhost:9000/ArtistaWs/buscar
	@PostMapping("buscar")
	public Artistas buscar(@RequestBody Artistas artistas) {
		return artistaServ.buscar(artistas);
	}

	//http://localhost:9000/ArtistaWs/guardar
	@PostMapping("guardar")	
	public ResponseEntity<String> guardar(@RequestBody Artistas artistas) {
		artistaServ.guardar(artistas);

		return new ResponseEntity<String>("Se guardó el artista", HttpStatus.OK);
	}

	//http://localhost:9000/ArtistaWs/editar
	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Artistas artistas) {
		artistaServ.editar(artistas);

		return new ResponseEntity<String>("Se editó el artista", HttpStatus.OK);
	}

	//http://localhost:9000/ArtistaWs/eliminar
	@PostMapping("eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Artistas artistas) {
		artistaServ.eliminar(artistas);

		return new ResponseEntity<String>("Se eliminó el artista", HttpStatus.OK);
	}
	
}
