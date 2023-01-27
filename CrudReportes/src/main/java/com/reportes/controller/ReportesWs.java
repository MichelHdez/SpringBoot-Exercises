package com.reportes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reportes.entidad.Reportes;
import com.reportes.servicios.ReportesServ;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ReportesWs {

	@Autowired
	ReportesServ reportesServ;
	
	// http://localhost:9000/listar
			@GetMapping("listar")
			public List<Reportes> listar() {
				List<Reportes> listaT = reportesServ.listar();
				return listaT;
			}

			// guardar
			// http://localhost:9000/guardar
			@PostMapping("guardar")
			public ResponseEntity<String> guardar(@RequestBody Reportes reportes) {
				reportesServ.guardar(reportes);

				return new ResponseEntity<String>("Se guardo el reporte", HttpStatus.OK);
			}

			// editar
			// http://localhost:9000/editar
			@PostMapping("editar")
			public ResponseEntity<String> editar(@RequestBody Reportes reportes) {
				reportesServ.editar(reportes);

				return new ResponseEntity<String>("Se edito el reporte", HttpStatus.OK);
			}

			// eliminar
			// http://localhost:9000/eliminar
			@PostMapping("eliminar")
			public ResponseEntity<String> eliminar(@RequestBody Reportes reportes) {
			reportesServ.eliminar(reportes);

				return new ResponseEntity<String>("Se elimino el reporte", HttpStatus.OK);
			}

			// buscar
			// http://localhost:9000/buscar
			@PostMapping("buscar")
			public Reportes buscar(@RequestBody Reportes reportes) {
				reportes = reportesServ.buscar(reportes);

				return reportes;
			}

}
