package com.mx.ProyectoHospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ProyectoHospital.dominio.Hospital;
import com.mx.ProyectoHospital.servicios.HospitalServ;

@RestController
@RequestMapping("HospitalWs")
@CrossOrigin
public class HospitalWs {
	
	@Autowired
	HospitalServ hospitalServ;
	
	//http://localhost:9000/HospitalWs/listar
	@GetMapping("listar")
	public List<Hospital> listar(){
		return hospitalServ.listar();
	}
	
	//http://localhost:9000/HospitalWs/buscar
	@PostMapping("buscar")
	public Hospital buscar(@RequestBody Hospital hospital) {
		System.out.println("Hospital a buscar " +hospital);
		return hospitalServ.buscar(hospital);
	}
	
	//http://localhost:9000/HospitalWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Hospital hospital) {
		hospitalServ.guardar(hospital);
	}
	
	//http://localhost:9000/HospitalWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Hospital hospital) {
		hospitalServ.editar(hospital);
	}
	
	//http://localhost:9000/HospitalWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Hospital hospital) {
		hospitalServ.eliminar(hospital);
	}
	
}
