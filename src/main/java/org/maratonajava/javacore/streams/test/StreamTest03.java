package org.maratonajava.javacore.streams.test;


import org.maratonajava.javacore.streams.dominio.Novel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest03 {

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
        // imprime todos os itens do array
        lista.stream().forEach(System.out::println);

        // exibe a contagem de todos novels com preço menor ou igual a 7
          Stream<Novel> stream = lista.stream();
          long count = stream
                  .distinct()
                  .filter(n -> n.getPrice() <= 7)
                  .count();
          System.out.println(count);

    }
}
