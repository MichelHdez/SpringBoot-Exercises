package com.mx.carro.vehiculo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.carro.vehiculo.dominio.Carro;
import com.mx.carro.vehiculo.servicios.CarroServicio;

@RestController
@RequestMapping("/carro")
public class CarroController {

	@Autowired
	private CarroServicio carroServicio;
	
	//http://localhost:8002/carro/listar

	@GetMapping("listar")
	public ResponseEntity<List<Carro>> listarCarros() {

		List<Carro> carros = carroServicio.getAll();
		if (carros.isEmpty()) {

			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(carros);

	}

	//http://localhost:8002/carro/{id}
	@GetMapping("/{id}")
	public ResponseEntity<Carro> obtenerCarro(@PathVariable("id") int id) {

		Carro carro = carroServicio.getCarroById(id);
		if (carro == null) {

			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(carro);

	}
//http://localhost:8002/carro/guardar
	@PostMapping("guardar")
	public ResponseEntity<Carro> guardarCarro(@RequestBody Carro carro) {

		Carro nuevoCarro = carroServicio.save(carro);
		return ResponseEntity.ok(nuevoCarro);

	}

	//http://localhost:8002/carro/usuario/{usuarioId}
	@GetMapping("/usuario/{usuarioId}")
	public ResponseEntity<List<Carro>> listarCarrosPorUsuarioId(@PathVariable("usuarioId") int id) {
		List<Carro> carros = carroServicio.byUsuarioId(id);
		if (carros.isEmpty()) {

			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.ok(carros);

	}
}
