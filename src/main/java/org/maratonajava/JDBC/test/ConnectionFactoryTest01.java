package org.maratonajava.JDBC.test;

import org.maratonajava.JDBC.conn.ConnectionFactory;
import org.maratonajava.JDBC.dominio.Producer;
import org.maratonajava.JDBC.repository.ProducerRepository;

public class ConnectionFactoryTest01 {

    public static void main(String[] args) {

       Producer producer = new Producer("Ghibli");

        ProducerRepository.save(producer);
    }
}
