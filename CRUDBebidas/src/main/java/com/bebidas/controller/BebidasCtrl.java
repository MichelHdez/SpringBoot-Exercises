package com.bebidas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bebidas.entidad.Bebidas;
import com.bebidas.servicios.BebidasServ;


@Controller
@RequestMapping("BebidasCtrl")
public class BebidasCtrl {

	@Autowired
	BebidasServ bebidasServ;
	
	@GetMapping("inicio")
	public String inicio(Model model) {
		var lista = bebidasServ.listar();
		System.out.println("lista--->" + lista);
		model.addAttribute("lista", lista);
		return "index";
	}
	
	@GetMapping("abrirGuardar")
	public String abrirGuardar(Bebidas bebidas) {
		return "agregar";
	}
	
	@PostMapping("guardar")
	public String guardar(Bebidas bebidas) {
		bebidasServ.guardar(bebidas);
		return "redirect:/BebidasCtrl/inicio";
	}
	
	@GetMapping("/abrirEditar/{id}")
	public String abrirEditar(Bebidas bebidas, Model model) {
		bebidas=bebidasServ.buscar(bebidas);
		model.addAttribute("bebidas", bebidas);
		return "editar";
	}
	
	@PostMapping("editar")
	public String editar(Bebidas bebidas) {
		bebidasServ.editar(bebidas);
		return "redirect:/BebidasCtrl/inicio";
	}
	
	@GetMapping("/abrirEliminar/{id}")
	public String abrirEliminar(Bebidas bebidas, Model model) {
		bebidas=bebidasServ.buscar(bebidas);
		model.addAttribute("bebidas", bebidas);
		return "eliminar";
	}
	
	@PostMapping("eliminar")
	public String eliminar(Bebidas bebidas) {
		bebidasServ.eliminar(bebidas);
		return "redirect:/BebidasCtrl/inicio";
	}
}
