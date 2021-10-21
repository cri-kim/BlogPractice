package com.example.demo.user.dao;

public class DaoFactory {
    public UserDao userdao(){
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);
        return userDao;
    }
}
