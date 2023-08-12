package org.maratonajava.javacore.streams.test;


import org.maratonajava.javacore.streams.dominio.Novel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest05 {

    public static void main(String[] args) {

        // cria uma lista inserindo diretamente os objetos

        ArrayList<Novel> listadelivros = new ArrayList<>(
                List.of(
                        new Novel("O Estrangeiro", 18.99),
                        new Novel("A Uruguaia", 28.99),
                        new Novel("Pedro Páramo", 5.20),
                        new Novel("Pulp", 6.99),
                        new Novel("O Processo", 14.99),
                        new Novel("Estranhos sinais de saturno", 59.99))
        );


        // contagem usando stream
        System.out.println(listadelivros.stream().count());

        // contagem usando collect
        System.out.println(listadelivros.stream().collect(Collectors.counting()));

        // objeto novel de maior preço
        listadelivros.stream()
                .max(Comparator.comparing(Novel::getPrice))
                .ifPresent(System.out::println);

        // preço dos produtos em ordem crescente
        List<Double> precoDosLivros = listadelivros.stream()
                .sorted(Comparator.comparing(Novel::getPrice))
                .map(Novel::getPrice)
                .collect(Collectors.toList());

        precoDosLivros.forEach(System.out::println);


        // preço dos produtos em ordem crescente
        List<Novel> livrosPorPreco = listadelivros.stream()
                .sorted(Comparator.comparing(Novel::getPrice))
                .map(novel -> new Novel(novel.getTitle(), novel.getPrice()))
                .collect(Collectors.toList());

        livrosPorPreco.forEach(System.out::println);
    }
}

