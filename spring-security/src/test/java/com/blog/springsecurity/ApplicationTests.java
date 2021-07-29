package com.blog.springsecurity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.context.support.WithUserDetails;

@SpringBootTest
class ApplicationTests {
	/* *
	 * 
	 * */
//	@WithUserDetails // userdetailsService 를 통해 유저정보 취즉
//	@WithMockUser//userdetailsService를 진행하지 않고 간단하게 인증정보 처리
	@Test
//	@WithAnonymousUser //인증되지 않은 상태를 처리하는 어노테이션
	void contextLoads() {
	}

}
