package org.maratonajava.javacore.streams.test;


import org.maratonajava.javacore.streams.dominio.Novel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest01 {

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

        // lista os novels por título
        lista.sort(Comparator.comparing(Novel::getTitle));
        System.out.println(lista);


        // recupera o título dos livros com preço menor ou igual a 19
        List<String> titulosLivros = new ArrayList<>();
        for(Novel livro : lista){
            if(livro.getPrice() <= 19.0){
                titulosLivros.add(livro.getTitle());
            }
        }

        System.out.println(titulosLivros);

        System.out.println("--------------------------------");

        // utilizando Streams para listar todos os livros
        lista.stream().forEach(System.out::println);

        System.out.println("---------------------------------");

        // utilizando Strems para listar livros com preço menor a 20
        List<Novel> listaDeLivrosComPrecoMenorQueVinte = lista.stream()
                .filter(novel -> novel.getPrice() <20)
                .collect(Collectors.toList());

        listaDeLivrosComPrecoMenorQueVinte.forEach(System.out::println);

        System.out.println("---------------------------------");

       List<Novel> listaDeLivrosComPrecoMenorAVinteEPorTitulo = lista.stream()
               .filter(novel -> novel.getPrice()<20)
               .sorted(Comparator.comparing(Novel::getTitle))
               .collect(Collectors.toList());

       listaDeLivrosComPrecoMenorAVinteEPorTitulo.forEach(System.out::println);
       // foreach igual à estrutura abaixo
       for(Novel livro : listaDeLivrosComPrecoMenorAVinteEPorTitulo){
           System.out.println(livro);
       }
    }
}
