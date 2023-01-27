package com.reportes.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reportes.dao.ReportesDao;
import com.reportes.entidad.Reportes;


@Service
public class ReportesServImp implements ReportesServ{

	@Autowired
	ReportesDao reportesDao;
	
	@Override
	public void guardar(Reportes reportes) {
		List<Reportes> lista = new ArrayList<Reportes>();
		lista = (List<Reportes>) reportesDao.findAll();
		System.out.println("lista de reportes -->"+lista);
	
		if(lista.isEmpty()) {
			System.out.println("la lista esta vacia");
			reportesDao.save(reportes);
		}else {
			for(Reportes r : lista) {
				if(r.getItem().equals(reportes.getItem())) {
					System.out.println("El televisor ya existe");
				}else {
					reportesDao.save(reportes);
				}
			}
		}
		
		}

	@Override
	public void editar(Reportes reportes) {
		reportesDao.save(reportes);
		
	}

	@Override
	public void eliminar(Reportes reportes) {
		reportesDao.delete(reportes);
		
	}

	@Override
	public Reportes buscar(Reportes reportes) {
		return reportesDao.findById(reportes.getId()).orElse(null);
	}

	@Override
	public List<Reportes> listar() {
		return (List<Reportes>) reportesDao.findAll();
	}

}
