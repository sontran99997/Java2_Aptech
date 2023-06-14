package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
    private static Connection conn = ConnectionDBSingleton.getInstance();
//    private  static Statement statement;
    public static ResultSet read(String sql){
        ResultSet rs;
        try {
            Statement statement = conn.createStatement();
            rs = statement.executeQuery(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }
    public static void insert(String sql){
        try{
            Statement statement = conn.createStatement();
            statement.execute(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void delete(String sql){
        try{
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void update(String sql){
        try{
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
