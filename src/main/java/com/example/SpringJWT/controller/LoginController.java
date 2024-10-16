package com.example.SpringJWT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.SpringJWT.dto.LoginDTO;

@Controller
@ResponseBody
public class LoginController {

	@PostMapping("/login")
	public String loginProcess(LoginDTO loginDTO) {
		
		System.out.println(loginDTO.getUsername());
		System.out.println(loginDTO.getPassword());
		
		return "ok";
	}
}
