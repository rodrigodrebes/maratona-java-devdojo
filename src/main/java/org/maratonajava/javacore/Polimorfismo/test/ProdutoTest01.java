package org.maratonajava.javacore.Polimorfismo.test;

import org.maratonajava.javacore.Polimorfismo.dominio.Computador;
import org.maratonajava.javacore.Polimorfismo.dominio.Tomate;
import org.maratonajava.javacore.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Computador pc = new Computador("ASUS", 6000);

        Tomate tomate = new Tomate("Italiano", 0.75);

        CalculadoraImposto.calcularImposto(pc);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
