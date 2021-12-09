package com.example.demo.user.dao;

import com.example.demo.user.domain.User;
import lombok.Data;

import javax.sql.DataSource;
import java.sql.*;

@Data
public class UserDao {

    private DataSource dataSource;

    public void add(User user) throws  SQLException {
        Connection c = dataSource.getConnection();

        PreparedStatement ps = c.prepareStatement(
                "insert into user(id, name, password) values(?,?,?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());
        ps.executeUpdate();

        ps.close();
        c.close();
    }

    public User get(String id) throws  SQLException {
        Connection c = dataSource.getConnection();
        PreparedStatement ps = c.prepareStatement(
                "select * from user where id = ?");
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));

        rs.close();
        ps.close();
        c.close();
        return user;
    }

    public void deleteAll() throws SQLException{
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = dataSource.getConnection();
            StatementStrategy strategy = new UserDaoDeleteAll();
            ps = strategy.makePreparedStatemnt(c);
            ps.executeUpdate();

        }catch (SQLException e){
            throw e;
        }finally{
            if(ps != null){
                try {
                    ps.close();
                }catch (SQLException e){
                }
            }
            if(ps != null){
                try {
                    c.close();
                }catch (SQLException e){
                }
            }
        }
    }

    public int getCount() throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = dataSource.getConnection();
            ps = c.prepareStatement("select count(*) from user");
            rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1);

        }catch (SQLException e){
            throw e;
        }finally{
            if(ps != null){
                try {
                    ps.close();
                }catch (SQLException e){
                }
            }
            if(ps != null){
                try {
                    c.close();
                }catch (SQLException e){
                }
            }
        }
    }
}
