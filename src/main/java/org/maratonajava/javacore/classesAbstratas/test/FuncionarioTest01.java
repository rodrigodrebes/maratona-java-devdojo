package org.maratonajava.javacore.classesAbstratas.test;

import org.maratonajava.javacore.classesAbstratas.dominio.Desenvolvedor;
import org.maratonajava.javacore.classesAbstratas.dominio.Funcionario;
import org.maratonajava.javacore.classesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {


        Gerente gerente = new Gerente("Ana", 10000);

        System.out.println(gerente);

        Desenvolvedor dev = new Desenvolvedor("Rodrigo", 8000);

        System.out.println(dev);

        gerente.calculaBonus();
        dev.calculaBonus();

        System.out.println(gerente);
        System.out.println(dev);

    }
}
