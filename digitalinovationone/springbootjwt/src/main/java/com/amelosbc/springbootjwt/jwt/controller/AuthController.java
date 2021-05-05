package com.amelosbc.springbootjwt.jwt.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amelosbc.springbootjwt.jwt.data.UserData;

@RestController
public class AuthController {

	private BCryptPasswordEncoder bCrypt;
	
	public AuthController (BCryptPasswordEncoder bCryptP) {
		this.bCrypt = bCryptP;
	}
	
	@PostMapping("/login")
	public void login (@RequestBody UserData user) {
		user.setPassword(bCrypt.encode(user.getPassword()));
	}
}
