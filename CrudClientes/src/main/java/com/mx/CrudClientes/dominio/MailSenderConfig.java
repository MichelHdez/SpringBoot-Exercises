package com.mx.CrudClientes.dominio;
import org.springframework.context.annotation.*;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailSenderConfig {

//   Commented for the purpose of using the properties file autoconfiguration ..
    @Bean("javaMailSender")

    public JavaMailSender javaMailSender() {
       JavaMailSenderImpl sender = new JavaMailSenderImpl();
       sender.setHost("smtp.gmail.com");
       sender.setPort(587);
       sender.setUsername("correo@gmail");
        sender.setPassword("password");

       Properties props = sender.getJavaMailProperties();
       props.put("mail.transport.protocol", "smtp");
       props.put("mail.smtp.auth", "true");
       props.put("mail.smtp.starttls.enable", "true");
       props.put("mail.debug", "true");

       return sender;
   }

}
