package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try{
            String host = "jdbc:sqlserver://localhost:1997;databaseName=demo";
            String uName = "sa";
            String uPass= "1111";
            Connection con = DriverManager.getConnection(host,uName,uPass);
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from sinhvien");
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }

            System.out.println("thanh cong");
        }catch (Exception e){
            System.out.println(e);
        }


    }
}