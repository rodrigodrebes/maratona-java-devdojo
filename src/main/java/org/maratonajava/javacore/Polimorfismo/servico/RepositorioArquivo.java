package org.maratonajava.javacore.Polimorfismo.servico;

import org.maratonajava.javacore.Polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar(){
        System.out.println("Salvando em arquivo");
    }
}
