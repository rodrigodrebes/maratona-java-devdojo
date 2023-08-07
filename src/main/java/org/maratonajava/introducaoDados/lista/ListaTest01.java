package org.maratonajava.introducaoDados.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("Rodrigo");
        lista.add("Ana");

        // Tamanho da lista
        System.out.println(lista.size());

        // Remoção de item da lista
        lista.remove("Ana");

        // Impressão de itens da lista
        for(String nome : lista){
            System.out.println(nome);
        }

        // Index de um nome
        System.out.println("Index de Rodrigo: " + lista.indexOf("Rodrigo"));

        // Lista de nomes com início "M".
        List<String> resultado = lista.stream()
                .filter(nome -> nome.charAt(0) == 'M')
                .collect(Collectors.toList());

        for(String nome : resultado){
            System.out.println(nome);
        }



        List<Conta> listaDeContas = new ArrayList<>();

        listaDeContas.add(new Conta(1500, "Ana", 5900));
        listaDeContas.add(new Conta(5888, "Rodrigo", 86222));

        for(Conta conta : listaDeContas){
            System.out.println(conta);
        }
    }





}
