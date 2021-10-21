package com.example.demo;

import com.example.demo.user.dao.NUserDao;
import com.example.demo.user.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		NUserDao dao = new NUserDao();
		User user = new User();
		user.setId("sjkim");
		user.setName("김수정");
		user.setPassword("123");

		try {
			dao.add(user);
			System.out.println(user.getId() + " sign up.");
		}catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}

		try {
			User user2 = dao.get(user.getId());
			System.out.println(user2.getName() + " is found.");
		}catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}


	}

}
