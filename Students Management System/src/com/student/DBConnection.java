package com.student;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    static Connection con;


    public static Connection createDBConnetion() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/studentdb";
            String user="root";
            String pass="";

            con=DriverManager.getConnection(url,user,pass);

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return con;

    }
}
