package org.maratonajava.javacore.lambdas.test;

import org.maratonajava.javacore.lambdas.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class LambdaTest01 {

    public static void main(String[] args) {

        List<Car> listacarros = new ArrayList<Car>(
                List.of(
                        new Car("Verde", 1987),
                        new Car("Verde", 1999),
                        new Car("Azul", 1999),
                        new Car("Amarelo", 1958),
                        new Car("Verde", 1930),
                        new Car("Verde", 1980)
                ));

        // sem lambda
        List<Car> carrosVerdes = new ArrayList<>();

        for(Car carro : listacarros){
            if(carro.getColor().equals("Verde")){
                carrosVerdes.add(carro);
            }

        }

        carrosVerdes.stream().forEach(System.out::println);


        // com lambda + stream

        List<Car> carrosAzuis = listacarros.stream()
                .filter(carro -> "Azul".equals(carro.getColor()))
                .collect(Collectors.toList());

        carrosAzuis.forEach(System.out::println);
    }

}
