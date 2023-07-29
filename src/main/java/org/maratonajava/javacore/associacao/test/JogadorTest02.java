package org.maratonajava.javacore.associacao.test;

import org.maratonajava.javacore.associacao.dominio.Jogador;
import org.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador pele = new Jogador("Pelé");
        Jogador messi = new Jogador("Messi");

        Time brasil = new Time("Brasil");
        Time argentina = new Time("Argentina");

pele.setTime(brasil);
messi.setTime(argentina);

pele.imprime();
messi.imprime();
    }
}
