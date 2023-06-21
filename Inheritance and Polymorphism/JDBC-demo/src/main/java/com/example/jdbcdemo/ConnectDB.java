package com.example.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static Connection instance;
    private ConnectDB(){}
    public static Connection getInstance(){
        if(instance ==  null){
            try{
                instance = DriverManager
                        .getConnection("jdbc:postgresql://localhost:5432/demo",
                                "postgres", "1111");


                System.out.println("thanh cong");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return instance;
    }
}
