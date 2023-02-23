package com.registro.usuario.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.registro.usuario.service.imp.JpaUserDetailsService;

@SuppressWarnings("deprecation")
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SpringSecurityConfig extends WebSecurityConfiguration{

	@Autowired
	private JpaUserDetailsService userDetailsService;
	private BCryptPasswordEncoder passwordEncoder;
	
	@Bean BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
	private LoginSuccessHandler sucessHandler;
	
	protected void configure(HttpSecurity http) throws Exception{
		try {
			http.authorizeRequests()
			//Permite nuestro js y css(en carpeta static)
			.requestMatchers("/*.js", "/*.css").permitAll()
			//Permite creacion de usuarios sin necesidad de estar logueado
			.requestMatchers("/users/**").permitAll()
			//Solo un usario logueado con estos roles acceda a /home
			.requestMatchers("/home").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
			//Para que solo un usuario logueado con ROLE_ADMIN pueda crear un producto
			.requestMatchers("/products/**").access("hasRole('ROLE_ADMIN')")
			//Logica del login
			.and().formLogin().successHandler(sucessHandler).loginPage("/login").loginProcessingUrl("/login")
			//si el login es exitoso retorna a /home
			.defaultSuccessUrl("/home").permitAll().and().logout().logoutSuccessUrl("/login").permitAll()
			//si el usuario va a una ruta sin acceso
			.and().exceptionHandling().accessDeniedPage("/error403");
			} catch (Exception e){
				System.out.println(e.getMessage());
				}
			}
	
	public void configureGlobal(AuthenticationManagerBuilder build) throws Exception{
		build.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
	}
	
}
