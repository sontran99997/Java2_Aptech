package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDBSingleton {
    private static Connection instance;
    private ConnectionDBSingleton(){}

    public static Connection getInstance() {
        if (instance == null){
            try{
                String host = "jdbc:sqlserver://localhost:1997;databaseName=demo";
                String uName = "sa";
                String uPass= "1111";
                instance = DriverManager.getConnection(host,uName,uPass);


                System.out.println("thanh cong");
//            return conn;
            }catch (SQLException e){
                throw new RuntimeException(e);
            }

        }
        return instance;


    }
}
