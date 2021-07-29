package com.blog.springsecurity.app.user.dto;

import com.blog.springsecurity.app.user.domain.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRequestDto {
	private String email;
	private String password;

	@Builder
	public UserRequestDto(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public User toEntity() {
		return User.builder().email(email).password(password).build();
	}
}
