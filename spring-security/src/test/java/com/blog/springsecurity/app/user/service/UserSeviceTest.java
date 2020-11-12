package com.blog.springsecurity.app.user.service;

import org.junit.jupiter.api.Test;

import com.blog.springsecurity.app.user.dto.UserRequestDto;

public class UserSeviceTest {
	
	private UserService userService;
	
	@Test
	public void 새로운_유저_등록하기() {
		//given
		UserRequestDto dto = UserRequestDto.builder()
				.email("test@naver.com")
				.password("test").build();
		//when
		userService.addUser(dto);
		//then
	}
}
