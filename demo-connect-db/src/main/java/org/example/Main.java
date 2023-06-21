package org.example;

import java.sql.*;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {
        /*String sqlin = "INSERT INTO sinhvien values (5,'phat','HCM')";
        CRUD.insert(sqlin);*/
        /*String sqldel = "delete from sinhvien where id = 1";
        CRUD.delete(sqldel);
        String sqlupd = "update sinhvien set ten = 'than' where id = 2";*/

        /*String sql = "select * from sinhvien";
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
        }*/

        Connection conn = ConnectDBPostgre.getConnection();
        String sqlread = "select * from persons";
        ResultSet resultSet = CRUDPostgre.read(sqlread);
        Object obj =   resultSet.first();
//        System.out.println(obj);
       resultSet.absolute(2);
       resultSet.relative(2);

            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.getString(4));
            System.out.println(resultSet.getString(5));



//        int count = CRUDPostgre.insert(5,"Quoc","Tran","Ung Van Khiem","HN");
        /*int count = CRUDPostgre.update(5,"Thanh","Tran","Ngo Quyen","HCM");
        System.out.println("Số dòng đã ảnh hưởng là " + count);*/








    }
}