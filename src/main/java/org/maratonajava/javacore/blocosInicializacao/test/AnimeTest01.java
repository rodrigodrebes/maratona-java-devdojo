package org.maratonajava.javacore.blocosInicializacao.test;

import org.maratonajava.javacore.blocosInicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("CDZ");

        for (int episodio: anime.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
