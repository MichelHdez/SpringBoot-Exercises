package com.mx.CrudClientes.servicio;

import com.mx.CrudClientes.dao.CotizacionDAO;
import com.mx.CrudClientes.dominio.Cotizacion;
import com.mx.CrudClientes.dominio.MailSenderConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CotizacionServiceImp implements CotizacionService{
    @Autowired
    CotizacionDAO cotizacionDAO;

    @Autowired
    MailService mailService;

    @Override
    public void guardar(Cotizacion cotizacion) {
        cotizacionDAO.save(cotizacion);
        mailService.enviarMensaje("Nueva Cotizacion",cotizacion);

    }

    @Override
    public void editar(Cotizacion cotizacion) {
        cotizacionDAO.save(cotizacion);
    }

    @Override
    public void eliminar(Cotizacion cotizacion) {
        cotizacionDAO.delete(cotizacion);
    }

    @Override
    public Cotizacion buscarID(Cotizacion cotizacion) {
        return cotizacionDAO.findById(cotizacion.getId()).orElse(new Cotizacion());
    }

    @Override
    public List<Cotizacion> buscarAtributo(Cotizacion cotizacion) {
        return cotizacionDAO.findByNombreAndApp(cotizacion.getNombre(), cotizacion.getApp());
    }

    @Override
    public List<Cotizacion> listar() {
        return (List<Cotizacion>) cotizacionDAO.findAll();
    }
}
