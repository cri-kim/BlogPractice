package com.example.demo.user.dao;

import com.example.demo.user.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;

import java.sql.SQLException;

public class UserDaoTest {

    @Test
    public void addAndGet() throws SQLException {
        UserDao userDao = new DaoFactory().userDao();
        User user = new User();
        user.setId("sjkim1");
        user.setName("김수정1");
        user.setPassword("123");

        userDao.add(user);

        User user2 = userDao.get(user.getId());

        assertThat(user.getName()).isEqualTo(user2.getName());
        assertThat(user.getPassword()).isEqualTo(user2.getPassword());
    }
}
