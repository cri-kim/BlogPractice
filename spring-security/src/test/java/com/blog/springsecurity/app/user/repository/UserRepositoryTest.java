package com.blog.springsecurity.app.user.repository;

import static org.assertj.core.api.BDDAssertions.then;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.blog.springsecurity.app.user.domain.User;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepository;

	@AfterEach
	public void cleanup() {
		userRepository.deleteAll();
	}
	
	@Test
	public void 특정_유저정보_가져오기(){
		//given
		//when
		User user = userRepository.findById((long)1).get();
		
		//then
		then("test@naver.com").isEqualTo(user.getEmail());
	}	
	
	@Test
	public void 모든_유저정보_가져오기(){
		//given
		//when
		User user = userRepository.findById((long)1).get();
		List<User> list = userRepository.findAll(); /* n+1 문제 확인*/
		
		//then
	}
	
}
