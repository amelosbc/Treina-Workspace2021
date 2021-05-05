package com.amelosbc.springbootjwt.jwt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amelosbc.springbootjwt.jwt.data.UserData;
import com.amelosbc.springbootjwt.jwt.service.UserDetailsServiceImpl;


@RestController
public class UserController {

	private final UserDetailsServiceImpl userDetailsService;
	
	public UserController (UserDetailsServiceImpl userDetailsService) {
		this.userDetailsService = userDetailsService;
	}
	
	@RequestMapping("/all-users")
	public List<UserData> listAllUsers(){
		return userDetailsService.listUsers();
	}
}
