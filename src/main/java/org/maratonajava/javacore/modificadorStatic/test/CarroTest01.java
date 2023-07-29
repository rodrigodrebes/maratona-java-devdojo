package org.maratonajava.javacore.modificadorStatic.test;

import org.maratonajava.javacore.modificadorStatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", 190);
        Carro carro2 = new Carro("Mercedes", 240);
        Carro carro3 = new Carro("BMW", 260);

        Carro.setVelocidadeLimite(180);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
