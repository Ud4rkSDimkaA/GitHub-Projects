package com.company;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DB_USER = "PrudnikDima";
    private static final String DB_PASSWORD = "DimafromBelarus1";
    private Connection connection;

    public Connection connectToDB(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException exception) {
            System.out.println("Driver not found!");
            exception.printStackTrace();
        }

        try {
            this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException exception) {
            System.out.println("Connection cant be established!");
            exception.printStackTrace();
        }

        return connection;
    }
}
