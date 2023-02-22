package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Client.ResultadoCliente;

@RestController
public class OperacionesController {
	
	@Autowired
	private ResultadoCliente clienteFeign;
	
	@GetMapping("/restar")
	public String restar(@RequestParam float a, @RequestParam float b) {
		return clienteFeign.mostrarResultado(a - b);
	}
}
