package com.registro.usuario.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.registro.usuario.model.Role;
import com.registro.usuario.model.Users;
import com.registro.usuario.repository.IRoleRepository;
import com.registro.usuario.repository.IUsersRepository;
import com.registro.usuario.service.IUsersService;

@Service
public class UsersServiceImpl implements IUsersService{

	@Autowired
	private IUsersRepository userRepository;
	
	@Autowired
	private IRoleRepository roleRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Override
	public void insert(Users user) {
		Users objUser = user;
		objUser.setPassword(passwordEncoder.encode(objUser.getPassword()));
		
		Role role = new Role();
		//Se asigna el rol con el que se va a crear el usuario
		role.setAuthority("ROLE_USER");
		role = roleRepository.save(role);
		
		objUser.getRoles().add(role);
		objUser = userRepository.save(objUser);
	}

	
}
