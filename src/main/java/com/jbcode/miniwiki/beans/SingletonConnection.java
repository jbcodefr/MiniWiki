package com.jbcode.miniwiki.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
    private static Connection connection;

    static {
        try{
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection(
                 "jdbc:postgresql://localhost:5432/miniwiki",
                 "postgres"   ,
                    "toor"

            );

        }catch (Exception e)
        {
            System.out.println(" problem avec la connection");
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return connection;
    }
}
