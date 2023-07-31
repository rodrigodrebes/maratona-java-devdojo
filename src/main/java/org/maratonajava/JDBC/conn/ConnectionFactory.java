package org.maratonajava.JDBC.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    //java.sql = Connection, Statement, ResultSet, DriverManager

    // Primeiro passo: criar a conexão
    public static Connection getConnection(){

        String url = "jdbc:mysql://localhost:3308/anime_store";
        String username = "root";
        String password = "root";

        try {
            return DriverManager.getConnection(url, username,password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
