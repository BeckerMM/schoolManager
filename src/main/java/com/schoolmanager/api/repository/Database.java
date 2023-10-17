package com.schoolmanager.api.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    private static final String URL_BANCO = "jdbc:mysql://localhost:3306/db_integracao";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    static public Connection connection() {
        try {
            return DriverManager.getConnection(URL_BANCO,USERNAME,PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}