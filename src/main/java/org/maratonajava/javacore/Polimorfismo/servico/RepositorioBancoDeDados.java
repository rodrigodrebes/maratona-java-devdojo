package org.maratonajava.javacore.Polimorfismo.servico;

import org.maratonajava.javacore.Polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar(){
        System.out.println("Salvando em banco de dados");
    }
}
