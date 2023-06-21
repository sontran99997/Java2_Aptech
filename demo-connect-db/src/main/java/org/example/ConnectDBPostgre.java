package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDBPostgre {
    public static Connection getConnection(){
        Connection conn = null;
        try{
            conn = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "1111");


            System.out.println("thanh cong");

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return conn;
    }
}
