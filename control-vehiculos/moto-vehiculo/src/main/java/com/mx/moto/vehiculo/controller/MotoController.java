package com.mx.moto.vehiculo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.moto.vehiculo.dominio.Moto;
import com.mx.moto.vehiculo.servicios.MotoServicio;


@RestController
@RequestMapping("/moto")
public class MotoController {

	@Autowired
	private MotoServicio motoServicio;

	@GetMapping("listar")
	public ResponseEntity<List<Moto>> listarMotos() {

		List<Moto> motos = motoServicio.getAll();
		if (motos.isEmpty()) {

			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(motos);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Moto> obtenerMoto(@PathVariable("id") int id) {

		Moto moto = motoServicio.getMotoById(id);
		if (moto == null) {

			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(moto);

	}
//http://localhost:8003/moto/guardar
	@PostMapping("guardar")
	public ResponseEntity<Moto> guardarMoto(@RequestBody Moto moto) {

		Moto nuevaMoto = motoServicio.save(moto);
		return ResponseEntity.ok(nuevaMoto);
	}

	@GetMapping("/usuario/{usuarioId}")
	public ResponseEntity<List<Moto>> listarMotosPorUsuarioId(@PathVariable("usuarioId") int id) {

		List<Moto> motos = motoServicio.byUsuarioId(id);
		if (motos.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(motos);

	}

}
