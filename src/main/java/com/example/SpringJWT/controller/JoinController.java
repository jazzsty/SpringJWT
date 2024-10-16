package com.example.SpringJWT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.SpringJWT.dto.JoinDTO;
import com.example.SpringJWT.service.JoinService;

@Controller
@ResponseBody
public class JoinController {

	private final JoinService joinService;
	
	public JoinController(JoinService joinService) {
		this.joinService = joinService;
	}
	
	@PostMapping("/join")
	public String joinProcess(JoinDTO joinDTO) {

		joinService.joinProcess(joinDTO);
		
		return "ok";
	}
}
