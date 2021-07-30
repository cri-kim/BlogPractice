<<<<<<< HEAD
package com.blog.springsecurity.app.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blog.springsecurity.app.user.domain.SecurityUser;
import com.blog.springsecurity.app.user.domain.User;
import com.blog.springsecurity.app.user.dto.UserRequestDto;
import com.blog.springsecurity.app.user.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Transactional
	public void addUser(UserRequestDto dto) {
		//new user
		User user = new User(dto.getEmail(), passwordEncoder.encode(dto.getPassword()));
		
		userRepository.save(user);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username).get();
		SecurityUser securityUser = new SecurityUser(user);
		return securityUser;
	}
}
=======
package com.blog.springsecurity.app.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blog.springsecurity.app.user.domain.SecurityUser;
import com.blog.springsecurity.app.user.domain.User;
import com.blog.springsecurity.app.user.dto.UserRequestDto;
import com.blog.springsecurity.app.user.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Transactional
	public void addUser(UserRequestDto dto) {
		//new user
		User user = new User(dto.getEmail(), passwordEncoder.encode(dto.getPassword()));
		
		userRepository.save(user);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username).get();
		SecurityUser securityUser = new SecurityUser(user);
		return securityUser;
	}
}
>>>>>>> 92d11ea1ce9cdc5e166da397e7384eb4733f2b78
