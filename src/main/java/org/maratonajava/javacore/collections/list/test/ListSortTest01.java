package org.maratonajava.javacore.collections.list.test;

import org.maratonajava.javacore.collections.list.dominio.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Attack on titan");
        mangas.add("DBZ");

        for (String manga : mangas){
            System.out.println(manga);
        }

        // como ordená-los?
        // método .sort() ou Collections

        System.out.println("---------------\nMangás ordenados \n");
        Collections.sort(mangas);
        for (String manga : mangas){
            System.out.println(manga);
        }


    }
}

