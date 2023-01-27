package com.mx.ProyectoHospital.servicios;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.ProyectoHospital.dao.HospitalDao;
import com.mx.ProyectoHospital.dominio.Hospital;
@Service
public class HospitalServImp implements HospitalServ{

	@Autowired
	private HospitalDao hospitalDao;
	
	@Transactional
	public void guardar(Hospital hospital) {
		hospitalDao.save(hospital);
		
	}

	@Transactional
	public void editar(Hospital hospital) {
		hospitalDao.save(hospital);
		
	}

	@Transactional
	public void eliminar(Hospital hospital) {
		hospitalDao.delete(hospital);
		
	}

	@Transactional(readOnly=true)
	public Hospital buscar(Hospital hospital) {
		return hospitalDao.findById(hospital.getId()).orElse(null);
	}

	@Transactional(readOnly=true)
	public List<Hospital> listar() {
		return hospitalDao.findAll();
	}

}
