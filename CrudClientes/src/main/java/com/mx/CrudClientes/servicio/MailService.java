package com.mx.CrudClientes.servicio;

import com.mx.CrudClientes.dominio.Cotizacion;
import com.mx.CrudClientes.dominio.MailSenderConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    MailSenderConfig mailSenderConfig;
    public void enviarMensaje(String subject, Cotizacion cotizacion){
        JavaMailSender sender =mailSenderConfig.javaMailSender();
        SimpleMailMessage message =new  SimpleMailMessage();
        message.setFrom("correo del que se envia");
        message.setTo("correo al que llega");
        message.setSubject(subject);
        message.setText(cotizacion.toString());
        sender.send(message);
    }
}
