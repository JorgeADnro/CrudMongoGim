package com.tutorial.crudmongoback.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tutorial.crudmongoback.security.entity.UserEntity;
import com.tutorial.crudmongoback.security.repository.UserEntityRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	UserEntityRepository userEntityRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Optional<UserEntity> userEntity = userEntityRepository.findByUsernameOrEmail(username, username);
		if(!userEntity.isPresent())
			return null;
		return UserPrincipal.build(userEntity.get()); 
	}
}
