package org.example;

import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {
        /*String sqlin = "INSERT INTO sinhvien values (5,'phat','HCM')";
        CRUD.insert(sqlin);*/
        String sqldel = "delete from sinhvien where id = 1";
        CRUD.delete(sqldel);
        String sqlupd = "update sinhvien set ten = 'than' where id = 2";

        String sql = "select * from sinhvien";
        ResultSet resultSet = CRUD.read(sql);
        while (true){
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
        }


        /*try{

            String sqlInsert = "INSERT INTO sinhvien values (4,'quoc','HCM')";
            statement.execute(sqlInsert);
            resultSet = statement.executeQuery("select * from sinhvien");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }*/






    }
}