package org.maratonajava.javacore.streams.test;


import org.maratonajava.javacore.streams.dominio.Category;
import org.maratonajava.javacore.streams.dominio.Novel;
import org.maratonajava.javacore.streams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest07 {

    public static void main(String[] args) {

        // cria uma lista inserindo diretamente os objetos

        ArrayList<Novel> listadelivros = new ArrayList<>(
                List.of(
                        new Novel("O Estrangeiro", 5.99, Category.ROMANCE),
                        new Novel("A Uruguaia", 28.99, Category.ROMANCE),
                        new Novel("Pedro Páramo", 5.20, Category.FICTION),
                        new Novel("Pulp", 5.99, Category.FICTION),
                        new Novel("O Processo", 5.99, Category.DRAMA),
                        new Novel("Estranhos sinais de saturno", 59.99, Category.POETRY))
        );

// group by exibindo categorias de promoção
       Map<Promotion, List<Novel>>  colecaoEmPromocao = listadelivros.stream()
                .collect(Collectors.groupingBy(livros -> {
                    return livros.getPrice() <6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
                }
                ));

        System.out.println(colecaoEmPromocao);

        // group by exibindo categorias dos livros + promoção
        Map<Category, Map<Promotion, List<Novel>>> colecao2 = listadelivros.stream().collect(Collectors.groupingBy(Novel::getCategory,
                Collectors.groupingBy(livros -> {
                            return livros.getPrice() <6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
                        }
                )));

        System.out.println(colecao2);
    }


    }


