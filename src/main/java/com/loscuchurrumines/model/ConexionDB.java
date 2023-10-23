package com.loscuchurrumines.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL_STRING = "jdbc:postgresql://ep-small-haze-88087949.us-east-2.aws.neon.tech/dbtienda";
    private static final String USER = "ximena-ortiz";
    private static final String PASS = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL_STRING, USER, PASS);
        
    }
}


