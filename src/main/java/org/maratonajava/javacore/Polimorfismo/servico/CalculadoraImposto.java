package org.maratonajava.javacore.Polimorfismo.servico;

import org.maratonajava.javacore.Polimorfismo.dominio.Computador;
import org.maratonajava.javacore.Polimorfismo.dominio.Produto;
import org.maratonajava.javacore.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto do computador");
        double imposto = produto.calcularImposto();
        System.out.println("Imposto do computador: "+ produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
    }

}
