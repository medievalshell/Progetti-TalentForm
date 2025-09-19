package com.JDBC.ExecuteQuery;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class Main {


    public static void main(String[] args) {

        Properties props = new Properties();
        try {
            props.load(Files.newInputStream(Path.of("music.properties"),
                    StandardOpenOption.READ));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        var dataSource = new MysqlDataSource();
        dataSource.setServerName(props.getProperty("serverName"));
        dataSource.setPort(Integer.parseInt(props.getProperty("port")));
        dataSource.setDatabaseName(props.getProperty("databaseName"));
        try {
            dataSource.setMaxRows(10);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String query = "SELECT * FROM music.artists limit 10";

//        String query = """
//            WITH RankedRows AS (
//                                SELECT *,
//                                ROW_NUMBER() OVER (ORDER BY artist_id) AS row_num
//                                FROM music.artists
//                            )
//                            SELECT *
//                                FROM RankedRows
//                            WHERE row_num <= 10""";

        try (var connection = dataSource.getConnection(
                props.getProperty("user"),
                System.getenv("MYSQL_PASS"));
             Statement statement = connection.createStatement();
        ) {
            ResultSet resultSet = statement.executeQuery(query);

            var meta = resultSet.getMetaData();

            System.out.println("===================");

            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf("%-15s", meta.getColumnName(i).toUpperCase());
            }
            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    System.out.printf("%-15s", resultSet.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public class MusicDML {

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/music",
                System.getenv("MYSQL_USER"),
                System.getenv("MYSQL_PASS"));
             Statement statement = connection.createStatement();
        ) {
            String tableName = "music.artists";
            String columnName = "artist_name";
            String columnValue = "Bob Dylan";
            if (!executeSelect(statement, tableName, columnName, columnValue)) {
                System.out.println("Maybe we should add this record");
                insertRecord(statement, tableName, new String[]{columnName},
                        new String[]{columnValue});
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean printRecords(ResultSet resultSet) throws SQLException {

        boolean foundData = false;
        var meta = resultSet.getMetaData();

        System.out.println("===================");

        for (int i = 1; i <= meta.getColumnCount(); i++) {
            System.out.printf("%-15s", meta.getColumnName(i).toUpperCase());
        }
        System.out.println();

        while (resultSet.next()) {
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf("%-15s", resultSet.getString(i));
            }
            System.out.println();
            foundData = true;
        }
        return foundData;
    }

    private static boolean executeSelect(Statement statement, String table,
                                         String columnName, String columnValue)
            throws SQLException {

        String query = "SELECT * FROM %s WHERE %s='%s'"
                .formatted(table, columnName, columnValue);
        var rs = statement.executeQuery(query);
        if (rs != null) {
            return printRecords(rs);
        }
        return false;
    }

    private static boolean insertRecord(Statement statement, String table,
                                        String[] columnNames, String[] columnValues)
            throws SQLException {

        String colNames = String.join(",", columnNames);
        String colValues = String.join("','", columnValues);
        String query = "INSERT INTO %s (%s) VALUES ('%s')"
                .formatted(table, colNames, colValues);
        System.out.println(query);
        boolean insertResult = statement.execute(query);
        int recordsInserted = statement.getUpdateCount();
        if (recordsInserted > 0) {
            executeSelect(statement, table,
                    columnNames[0], columnValues[0]);
        }
        return recordsInserted > 0;
    }
}

}


