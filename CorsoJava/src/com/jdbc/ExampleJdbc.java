package com.jdbc;

import java.sql.*;

public class ExampleJdbc {

	public static void main(String[] args) {
		
		try {
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "Romeshell00$"
            );
            System.out.println("Connesso!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


	}

}
