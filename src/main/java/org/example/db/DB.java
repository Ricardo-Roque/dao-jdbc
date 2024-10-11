package org.example.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {
    private static Connection connection = null;

    private static Properties loadProperties() {

        try (FileInputStream fs = new FileInputStream("C:\\Users\\ricar\\IdeaProjects\\dao-jdbc\\dao-jdbc\\src\\db.properties")) {

            Properties props = new Properties();
            props.load(fs);

            return props;

        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static Connection getConnection() {

        if (connection == null) {
            try {

                Properties properties = loadProperties();
                String url = properties.getProperty("dburl");

                connection = DriverManager.getConnection(url, properties);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException exception) {
                throw new DbException(exception.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException exception) {
                throw new DbException(exception.getMessage());
            }
        }
    }
}
