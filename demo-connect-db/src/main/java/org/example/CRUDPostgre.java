package org.example;

import java.sql.*;

public class CRUDPostgre {
    private static Connection conn = ConnectDBPostgreSingleton.getInstance();
    public static ResultSet read(String sql){
        ResultSet rs;
        try{
            Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }
    public static int insert(int id, String lastname, String firstname, String address, String city){
        try{
            String sql = "Insert into persons values(?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE);
            statement.setInt(1,id);
            statement.setString(2,lastname);
            statement.setString(3,firstname);
            statement.setString(4,address);
            statement.setString(5,city);
            return statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static int update(int id, String lastname, String firstname, String address, String city){
        try{
            String sql = "update persons set lastname = ?, firstname = ?, address = ?, city = ? where personid = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,lastname);
            statement.setString(2,firstname);
            statement.setString(3,address);
            statement.setString(4,city);
            statement.setInt(5,id);
            return statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static int delete(int id){
        try{
            String sql = "delete persons where personid = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,id);
            return statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
