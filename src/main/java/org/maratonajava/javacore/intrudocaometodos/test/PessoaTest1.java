package org.maratonajava.javacore.intrudocaometodos.test;

import org.maratonajava.javacore.intrudocaometodos.dominio.Pessoa;

public class PessoaTest1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Rodrigo");
        pessoa.setIdade(27);
        pessoa.setSalarios(new double[]{1200,987.35,2000,6000});
        pessoa.mediaSalario();
        System.out.println(pessoa.getMedia());



    }
}
