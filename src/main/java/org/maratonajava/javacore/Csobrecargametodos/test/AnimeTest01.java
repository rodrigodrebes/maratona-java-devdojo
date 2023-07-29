package org.maratonajava.javacore.Csobrecargametodos.test;

import org.maratonajava.javacore.Csobrecargametodos.dominio.Anime;
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("CDZ", "TV", 32);
       anime.imprime();


    }
}
