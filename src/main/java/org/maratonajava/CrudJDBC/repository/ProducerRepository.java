package org.maratonajava.CrudJDBC.repository;

import org.maratonajava.CrudJDBC.conn.ConnectionFactory;
import org.maratonajava.CrudJDBC.dominio.Producer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProducerRepository {


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


    // SAVE
    private static PreparedStatement createPrepareStatement(Connection conn, Producer producer) throws
            SQLException{
        String sql = "INSERT INTO producer (name) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }
    public static void save(Producer producer){
        System.out.println("Salvando Produtor "+ producer);
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement ps = createPrepareStatement(conn, producer)){

            int affectedRows = ps.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Criação de Produtor falhou.");
            }

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
