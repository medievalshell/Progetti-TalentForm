package com.JDBC;


import java.sql.*;


public class Jdbc {


    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "6586";


        try {

            Connection connection = DriverManager.getConnection(url, username, password);

            connection.close();
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }


        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
        ) {

            String table = "CREATE TABLE REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";

            stmt.executeUpdate(table);

            String insert = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
            stmt.executeUpdate(insert);
            insert = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
            stmt.executeUpdate(insert);
            insert = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
            stmt.executeUpdate(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}