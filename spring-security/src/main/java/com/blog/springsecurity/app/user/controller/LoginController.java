package com.blog.springsecurity.app.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blog.springsecurity.app.user.dto.UserRequestDto;
import com.blog.springsecurity.app.user.service.UserService;

@RestController
public class LoginController {
	@Autowired
	UserService userService;
	
	@PostMapping(name = "/app/user/add")
	public ResponseEntity addUser(@RequestBody UserRequestDto dto) {
		userService.addUser(dto);
		return new ResponseEntity(HttpStatus.OK);
	}
}
