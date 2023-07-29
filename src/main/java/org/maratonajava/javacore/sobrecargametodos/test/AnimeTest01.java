package org.maratonajava.javacore.sobrecargametodos.test;

import org.maratonajava.javacore.sobrecargametodos.dominio.Anime;
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("CDZ", "TV", 32);
       anime.imprime();


    }
}
