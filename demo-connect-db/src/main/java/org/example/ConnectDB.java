package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static Connection getConnection(){
        Connection conn = null;
        try{
            String host = "jdbc:sqlserver://localhost:1997;databaseName=demo";
            String uName = "sa";
            String uPass= "1111";
            conn = DriverManager.getConnection(host,uName,uPass);


            System.out.println("thanh cong");
//            return conn;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return conn;
    }
}
