package com.blog.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // JPA auditing 활성화
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
