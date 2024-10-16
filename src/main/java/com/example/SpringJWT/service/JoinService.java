package com.example.SpringJWT.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.SpringJWT.dto.JoinDTO;
import com.example.SpringJWT.entity.UserEntity;
import com.example.SpringJWT.repository.UserRepository;

@Service
public class JoinService {
	
	private final UserRepository userRepository;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public JoinService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userRepository = userRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	public void joinProcess(JoinDTO joinDTO) {
		
		String username = joinDTO.getUsername();
		String password = joinDTO.getPassword();
		String role = joinDTO.getRole();
		
		Boolean isExist = userRepository.existsByUsername(username);
		
		if(isExist) {
			return;
		}
		
		UserEntity data = new UserEntity();
		data.setUsername(username);
		data.setPassword(bCryptPasswordEncoder.encode(password));
		data.setRole(role);
		
		userRepository.save(data);
	}
}
