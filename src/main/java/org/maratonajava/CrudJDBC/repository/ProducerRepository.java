package org.maratonajava.CrudJDBC.repository;

import org.maratonajava.CrudJDBC.conn.ConnectionFactory;
import org.maratonajava.CrudJDBC.dominio.Producer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public static void delete(int id){
        String sql = "DELETE FROM producer WHERE id = ?";

        try(
                Connection con = ConnectionFactory.getConnection();
                PreparedStatement stmt = con.prepareStatement(sql);
        ){

            stmt.setInt(1, id);
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

    // READ -- FIND ALL
    public static List<Producer> findAll(){
        String sql = "SELECT id, name FROM producer;";
        List<Producer> producers = new ArrayList<>();
        try(
                Connection con = ConnectionFactory.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs =  stmt.executeQuery(sql);
        ){
            while(rs.next()){
                var id =  rs.getInt("id");
                var name =  rs.getString("name");
                Producer producer = Producer.builder()
                        .id(id)
                        .name(name)
                        .build();
                producers.add(producer);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return producers;
    }




    public static List<Producer> findByName(String name){
        String sql = String.format("SELECT id, name FROM producer WHERE name like '%%%s%%'", name);

        List<Producer> producers = new ArrayList<>();
        try(
                Connection con = ConnectionFactory.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs =  stmt.executeQuery(sql);
        ){

            while(rs.next()){
                var id =  rs.getInt("id");
                var producerName =  rs.getString("name");
                Producer producer = Producer.builder()
                        .id(id)
                        .name(producerName)
                        .build();
                producers.add(producer);
            }

        } catch(SQLException e){
            e.printStackTrace();
        }
        return producers;
    }






}
