package org.maratonajava.javacore.heranca.test;

import org.maratonajava.javacore.heranca.dominio.Endereco;
import org.maratonajava.javacore.heranca.dominio.Funcionario;
import org.maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua dos Limoeiros");
        endereco.setCep("9999-9999");

        Pessoa pessoa = new Pessoa("Rodrigo");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-------------------");

        Funcionario funcionario = new Funcionario("Lucas");
        funcionario.setCpf("999999999");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);
        funcionario.imprime();
    }
}
