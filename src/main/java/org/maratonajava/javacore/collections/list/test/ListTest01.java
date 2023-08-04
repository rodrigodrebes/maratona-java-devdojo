package org.maratonajava.javacore.collections.list.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        // lista de Strings
        List <String> nomes = new ArrayList<>();
        // adicionar
        nomes.add("Rodrigo");
        nomes.add("Lucas");
        // remover
        nomes.remove(1);

        // forEach
        for(String nome : nomes){
            System.out.println(nome);
        }

        // for tradicional
        for(int i=0; i< nomes.size(); i++){
            System.out.println(nomes.get(i));
        }


        // lista de Inteiros

        List<Integer> numeros = new ArrayList<>();

        for(int i = 0; i <=10; i++){
            numeros.add(i);
        }

        System.out.println(numeros);

    }
}
