package org.maratonajava.JDBC.repository;

import org.maratonajava.JDBC.conn.ConnectionFactory;
import org.maratonajava.JDBC.dominio.Producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {

    public static void save(Producer producer){
        String sql = "INSERT INTO producer(name) VALUES(?);";

        try(Connection con = ConnectionFactory.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)){

            stmt.setString(1, producer.getName());
            stmt.executeUpdate();

        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
