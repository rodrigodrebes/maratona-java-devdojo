package org.maratonajava.JDBC.repository;

import org.maratonajava.JDBC.conn.ConnectionFactory;
import org.maratonajava.JDBC.dominio.Producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {

    // INSERT
    public static void save(Producer producer){
        String sql = "INSERT INTO producer(name) VALUES(?);";

        try(Connection con = ConnectionFactory.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)){

            stmt.setString(1, producer.getName());
            stmt.executeUpdate();

        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    // DELETE
    public static void delete(int idr){
        String sql = "DELETE FROM producer WHERE (id = ?);";

        try(Connection con = ConnectionFactory.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)){

            stmt.setInt(1, idr);
            stmt.executeUpdate();

        } catch(SQLException e){
            e.printStackTrace();
        }
    }


    // UPDATE
    public static void update(Producer producer){
        String sql = "UPDATE producer SET name = ? WHERE id = ?;";

        try(Connection con = ConnectionFactory.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)){

            stmt.setString(1, producer.getName());
            stmt.setInt(2, producer.getId());
            stmt.executeUpdate();

        } catch(SQLException e){
            e.printStackTrace();
        }
    }

}
