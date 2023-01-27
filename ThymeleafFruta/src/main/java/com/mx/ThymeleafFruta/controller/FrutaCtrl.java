package com.mx.ThymeleafFruta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.ThymeleafFruta.dominio.Fruta;
import com.mx.ThymeleafFruta.servicios.FrutaServ;

@Controller
@RequestMapping("FrutaCtrl")
public class FrutaCtrl {
	@Autowired
	FrutaServ frutaServ;
	
	@GetMapping("inicio")
	public String inicio(Model model) {
		var lista = frutaServ.listar();
		System.out.println("lista-->" +lista);
		model.addAttribute("lista", lista);
		return "index";
	}
	
	@GetMapping("abrirGuardar")
	public String abrirGuardar(Fruta fruta) {
		return "agregar";
	}
	
	@PostMapping("guardar")
	public String guardar(Fruta fruta) {
		frutaServ.guardar(fruta);
		return "redirect:/FrutaCtrl/inicio";
	}
	
	@GetMapping("/abrirEditar/{id}")
	public String abrirEditar(Fruta fruta, Model model) {
		fruta=frutaServ.buscar(fruta);
		model.addAttribute("fruta", fruta);
		return "editar";
	}
	
	@PostMapping("editar")
	public String editar(Fruta fruta) {
		frutaServ.editar(fruta);
		return "redirect:/FrutaCtrl/inicio";
	}//editar
	
	@GetMapping("/abrirEliminar/{id}")
	public String abrirEliminar(Fruta fruta, Model model) {
		fruta=frutaServ.buscar(fruta);
		model.addAttribute("fruta", fruta);
		return "eliminar";
	}//eliminar
	
	@PostMapping("eliminar")
	public String eliminar(Fruta fruta) {
		frutaServ.eliminar(fruta);
		return "redirect:/FrutaCtrl/inicio";
	}	
}
