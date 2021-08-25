package com.bootcamp.rslearn.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootcamp.rslearn.dto.UserDTO;
import com.bootcamp.rslearn.entities.User;
import com.bootcamp.rslearn.repositories.UserRepository;
import com.bootcamp.rslearn.services.exceptions.ResourceNotFoundException;

@Service
public class UserService implements UserDetailsService{
	
	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		Optional <User> obj = repository.findById(id);
		User entity = obj.orElseThrow(()-> new ResourceNotFoundException("Entity Not Found"));
		return new UserDTO(entity);
		
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repository.findByEmail(username);
		if(user == null) {
			logger.error("User not found: "+username);
			throw new UsernameNotFoundException("E-mail not found"); 
		}
		logger.info("User Found "+username);
		return user;
	}

}
