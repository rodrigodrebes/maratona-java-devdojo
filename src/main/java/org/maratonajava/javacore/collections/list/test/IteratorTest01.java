package org.maratonajava.javacore.collections.list.test;

import org.maratonajava.javacore.collections.list.dominio.Manga;

import java.util.*;
import java.util.stream.Stream;

public class IteratorTest01 {

    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Berserk", 6.9, 15));
        mangas.add(new Manga(4L,"Pokemon", 32.60, 20));
        mangas.add(new Manga(3L,"Attack on Titan", 19.9, 50));
        mangas.add(new Manga(2L,"Dragon ball z", 16.49, 5));
        mangas.add(new Manga(1L,"Cavaleiros do Zodíaco", 5.49, 1));

        // remove se a quantidade for igual a zero
        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        // retorna a lista de todos, por id
        mangas.stream()
                .sorted(Comparator.comparingLong(Manga::getId))
                .forEach(System.out::println);
    }
}
