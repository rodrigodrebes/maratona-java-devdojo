package org.maratonajava.javacore.collections.list.test;

import org.maratonajava.javacore.collections.list.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Berserk", 6.9));
        mangas.add(new Manga(4L,"Pokemon", 32.60));
        mangas.add(new Manga(3L,"Attack on Titan", 19.9));
        mangas.add(new Manga(2L,"Dragon ball z", 16.49));
        mangas.add(new Manga(1L,"Cavaleiros do Zodíaco", 5.49));

        System.out.println(mangas);


        // valor ordenado por ID
        System.out.println("-------------");
        Collections.sort(mangas);
        for (Manga manga : mangas){
            System.out.println(manga);
        }


    }
}
