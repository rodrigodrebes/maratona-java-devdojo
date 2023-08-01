package org.maratonajava.javacore.streams.test;


import org.maratonajava.javacore.streams.dominio.Novel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
    }
}
