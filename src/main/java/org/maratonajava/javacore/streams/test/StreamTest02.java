package org.maratonajava.javacore.streams.test;


import org.maratonajava.javacore.streams.dominio.Novel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {

    // cria uma lista inserindo diretamente os objetos
    public static ArrayList<Novel> lista = new ArrayList<>(
            List.of(
            new Novel("O Estrangeiro", 18.99),
            new Novel("A Uruguaia", 28.99),
            new Novel("Pedro Páramo", 5.20),
            new Novel("Pulp", 6.99),
            new Novel("O Processo", 14.99),
            new Novel("Estranhos sinais de saturno", 59.99))
    );
    public static void main(String[] args) {

        // recupera o título dos livros com preço menor ou igual a 19
        List<String> titulos = lista.stream()
                .sorted(
                        Comparator.comparing(Novel::getTitle))
                .filter(livro -> livro.getPrice() <= 18)
                .map(Novel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titulos);

        // lista os novels por título
        List<String> titulos2 = lista.stream()
                .sorted(
                        Comparator.comparing(Novel::getTitle))
                .map(Novel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titulos2);
    }
}
