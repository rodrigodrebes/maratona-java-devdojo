package org.maratonajava.JDBC.service;

import org.maratonajava.JDBC.dominio.Producer;
import org.maratonajava.JDBC.repository.ProducerRepository;

public class ProducerService {

    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void delete(int id){
        if (id<=0){
            throw new IllegalArgumentException("Invalid value for ID");
        }
        ProducerRepository.delete(id);
    }
}
