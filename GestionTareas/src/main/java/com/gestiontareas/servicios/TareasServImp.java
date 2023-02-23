package com.gestiontareas.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gestiontareas.dao.TareasDao;
import com.gestiontareas.entidad.Tareas;

@Service
public class TareasServImp implements TareasServ {

	@Autowired
	private TareasDao tareasDao;

	@Override
	public void guardar(Tareas tareas) {
		List<Tareas> lista = new ArrayList<Tareas>();
		lista = (List<Tareas>) tareasDao.findAll();
		System.out.println("lista de tareas --> " + lista);

		if (lista.isEmpty()) {
			System.out.println("la lista esta vacia");
			tareasDao.save(tareas);
		} else {
			for (Tareas t : lista) {
				if (t.getTitulo().equals(tareas.getTitulo())) {
					System.out.println("la tareas ya existe");
				} else {
					tareasDao.save(tareas);
				}
			}
		}

	}

	@Override
	public void editar(Tareas tareas) {
		tareasDao.save(tareas);

	}

	@Override
	public void eliminar(Tareas tareas) {
		tareasDao.delete(tareas);

	}

	@Override
	public Tareas buscar(Tareas tareas) {
		return tareasDao.findById(tareas.getId()).orElse(null);
	}

	@Override
	public List<Tareas> listar() {
		return tareasDao.findAll();
	}

	/*@Override
	public Tareas findByEstado(String estado) {
		Tareas tareas = new Tareas();
		for(Tareas t : tareasDao.findAll() ) {
			/*if(t.getId() == tareas.getId()) {
				tareas = t;
			}
			if(t.getEstado().equals(tareas.getEstado())) {
				tareas = t;
			}
		}
		
		return tareas;
	}*/

	@Override
	public List<Tareas> findByEstado(Tareas tareas) {
		// TODO Auto-generated method stub
		List<Tareas> listaT = new ArrayList<Tareas>();
		for(Tareas t : tareasDao.findAll() ) {
			if(t.getId() == tareas.getId()) {
				listaT.add(t);
			}
			if(t.getEstado().equals(tareas.getEstado())) {
				listaT.add(t);
			}
		}
		return listaT;
	}

}
