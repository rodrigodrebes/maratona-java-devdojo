package org.maratonajava.javacore.associacao.test;

import org.maratonajava.javacore.associacao.dominio.Jogador;
import org.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador cafu = new Jogador("Cafu");
        Jogador kaka = new Jogador("Kaká");
        Time brasil = new Time("Brasil");

        Jogador[] jogadores = {cafu, kaka};

        cafu.setTime(brasil);

        brasil.setJogadores(jogadores);

        System.out.println("----Jogador----");
        cafu.imprime();

        System.out.println("----Time----");
        brasil.imprime();
    }
}
