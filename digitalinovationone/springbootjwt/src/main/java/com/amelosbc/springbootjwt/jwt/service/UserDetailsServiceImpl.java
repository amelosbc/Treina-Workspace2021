package com.amelosbc.springbootjwt.jwt.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.amelosbc.springbootjwt.jwt.data.*;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private final BCryptPasswordEncoder bCryptPasswordEncoder;

	public UserDetailsServiceImpl(BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	public UserDetails loadUsersByUserName(String userName) throws UsernameNotFoundException {

		UserData user = findUser(userName);
		if (user == null) {
			throw new UsernameNotFoundException(userName);
		}

		return new User(user.getUserName(), user.getPassword(), Collections.emptyList());
	}

	private UserData findUser(String userName) {
		UserData user = new UserData();
		user.setUserName("admin");
		user.setPassword(bCryptPasswordEncoder.encode("ninda"));
		return user;

	}
	
	public List<UserData> listUsers() {
		ArrayList<UserData> lst = new ArrayList<>();
		lst.add(findUser("admin"));
		return lst;

	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
