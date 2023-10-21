package com.loscuchurrumines.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL_STRING= "jdbc:mysql://127.0.0.1:3306/dbtienda";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL_STRING, USER, PASS);
    }
}