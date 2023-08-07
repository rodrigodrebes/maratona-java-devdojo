package org.maratonajava.javacore.streams.test;


import org.maratonajava.javacore.streams.dominio.Category;
import org.maratonajava.javacore.streams.dominio.Novel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest06 {

    public static void main(String[] args) {

        // cria uma lista inserindo diretamente os objetos

        ArrayList<Novel> listadelivros = new ArrayList<>(
                List.of(
                        new Novel("O Estrangeiro", 18.99, Category.ROMANCE),
                        new Novel("A Uruguaia", 28.99, Category.ROMANCE),
                        new Novel("Pedro Páramo", 5.20, Category.FICTION),
                        new Novel("Pulp", 6.99, Category.FICTION),
                        new Novel("O Processo", 14.99, Category.DRAMA),
                        new Novel("Estranhos sinais de saturno", 59.99, Category.POETRY))
        );

        // listando por categoria sem stream e collect
        Map<Category, List<Novel>> categoryListaLivrosMap = new HashMap<>();

        List<Novel> poetry = new ArrayList<>();
        List<Novel> romance = new ArrayList<>();
        List<Novel> fiction = new ArrayList<>();

        for(Novel livro : listadelivros){
            switch (livro.getCategory()){
                case POETRY :  poetry.add(livro); break;
                case FICTION :  fiction.add(livro); break;
                case ROMANCE :  romance.add(livro); break;
            }
        }

        categoryListaLivrosMap.put(Category.POETRY, poetry);

        System.out.println(categoryListaLivrosMap);


        // listando por categoria com stream e collect
        Map<Category, List<Novel>> collect = listadelivros.stream()
                .collect(Collectors.groupingBy(Novel::getCategory));

        System.out.println(collect);


        // lista por categoria específica
        List<Novel> dramaNovels = listadelivros.stream()
                .filter(novel -> novel.getCategory() == Category.DRAMA)
                .collect(Collectors.toList());

        System.out.println(dramaNovels);


        // contagem de categoria específica
        Map<Category, Long> categoriaEspecifica =
                listadelivros.stream()
                        .collect(Collectors.groupingBy(Novel::getCategory, Collectors.counting()));

        System.out.println(categoriaEspecifica);



    }
}

