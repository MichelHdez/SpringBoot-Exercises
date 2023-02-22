package com.mx.ThymeleafAtleta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.ThymeleafAtleta.dominio.Atleta;
import com.mx.ThymeleafAtleta.servicios.AtletaServ;

@Controller
@RequestMapping("AtletaCtrl")
public class AtletaCtrl {
	
	@Autowired
	AtletaServ atletaServ;
	
	@GetMapping("inicio")
	public String inicio(Model model) {
		var lista = atletaServ.listar();
		System.out.println("lista--->" + lista);
		model.addAttribute("lista", lista);
		return "index";
	}
	
	@GetMapping("abrirGuardar")
	public String abrirGuardar(Atleta atleta) {
		return "agregar";
	}
	
	@PostMapping("guardar")
	public String guardar(Atleta atleta) {
		atletaServ.guardar(atleta);
		return "redirect:/AtletaCtrl/inicio";
	}
	
	@GetMapping("/abrirEditar/{id}")
	public String abrirEditar(Atleta atleta, Model model) {
		atleta=atletaServ.buscar(atleta);
		model.addAttribute("atleta", atleta);
		return "editar";
	}
	
	@PostMapping("editar")
	public String editar(Atleta atleta) {
		atletaServ.editar(atleta);
		return "redirect:/AtletaCtrl/inicio";
	}
	
	@GetMapping("/abrirEliminar/{id}")
	public String abrirEliminar(Atleta atleta, Model model) {
		atleta=atletaServ.buscar(atleta);
		model.addAttribute("atleta", atleta);
		return "eliminar";
	}
	
	@PostMapping("eliminar")
	public String eliminar(Atleta atleta) {
		atletaServ.eliminar(atleta);
		return "redirect:/AtletaCtrl/inicio";
	}
	
}
