package com.example.demo.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoDeleteAll implements StatementStrategy{
    public PreparedStatement makePreparedStatemnt(Connection c) throws SQLException{
        PreparedStatement ps = c.prepareStatement("delete from user");
        return ps;
    }
}
