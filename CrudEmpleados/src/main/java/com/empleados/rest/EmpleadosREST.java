package com.empleados.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empleados.dao.EmpleadosDao;
import com.empleados.entidad.Empleados;

@RestController
@RequestMapping("empleados")
public class EmpleadosREST {

	@Autowired
	private EmpleadosDao empleadosDao;

	@GetMapping
	public ResponseEntity<List<Empleados>> getEmpleado() {
		List<Empleados> empleados = (List<Empleados>) empleadosDao.findAll();
		return ResponseEntity.ok(empleados);
	}

	@PostMapping
	public ResponseEntity<Empleados> createEmpleado(@RequestBody Empleados empleados) {
		Empleados newEmpleado = empleadosDao.save(empleados);
		return ResponseEntity.ok(newEmpleado);
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<Empleados> getProductById(@PathVariable("productId") int productId) {
		Optional<Empleados> optionalProduct = empleadosDao.findById(productId);
		if (optionalProduct.isPresent()) {
			return ResponseEntity.ok(optionalProduct.get());
		} else {
			return ResponseEntity.noContent().build();
		}
	}

	@DeleteMapping(value="{empleadoId}")
	public ResponseEntity<Void> deleteEmpleado(@PathVariable("empleadoId") int empleadoId){
		empleadosDao.deleteById(empleadoId);
		return ResponseEntity.ok(null);
	}
	
	@PutMapping
	public ResponseEntity<Empleados> updateEmpleado(@RequestBody Empleados empleados){
		Optional<Empleados> optionalEmpleado = empleadosDao.findById(empleados.getId());
		if (optionalEmpleado.isPresent()) {
			Empleados updateEmpleado = optionalEmpleado.get();
			updateEmpleado.setNumeroempleado(empleados.getNumeroempleado());
			updateEmpleado.setNombre(empleados.getNombre());
			updateEmpleado.setFechanacimiento(empleados.getFechanacimiento());
			updateEmpleado.setTelefono(empleados.getTelefono());
			updateEmpleado.setEstatus(empleados.getEstatus());
			empleadosDao.save(updateEmpleado);
			return ResponseEntity.ok(updateEmpleado);
		}else {
			return ResponseEntity.noContent().build();
		}
	}
	
	
	
	
	
	
	
	
}
