package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToDB {
    public static Connection main() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary?useSSL=false", "root", "");
        } catch (Exception e) {
            System.out.println("Exception Caught");
        }
        return con;
    }
}
