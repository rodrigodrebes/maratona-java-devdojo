package org.maratonajava.javacore.Polimorfismo.test;

import org.maratonajava.javacore.Polimorfismo.repositorio.Repositorio;
import org.maratonajava.javacore.Polimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest01 {

    public static void main(String[] args) {

        Repositorio repbd = new RepositorioBancoDeDados();
        repbd.salvar();

        List<String> lista = new ArrayList<>();
        lista.add("Rodrigo");
        lista.add("José");

        System.out.println(lista);

    }
}
