package com.manager.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static Connection con = null;
    static
    {
        String url = "jdbc:mysql://localhost/Jakeer";
        String user = "root";
        String pass = "Star@123";
        try {
        //  Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (/*ClassNotFoundException |*/ SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return con;
    }
}
