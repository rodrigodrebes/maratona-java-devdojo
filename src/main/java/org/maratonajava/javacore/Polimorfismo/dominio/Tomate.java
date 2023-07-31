package org.maratonajava.javacore.Polimorfismo.dominio;

public class Tomate extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.08;

    public Tomate(String nome, double valor){
        super(nome, valor);
    }

    public double calcularImposto(){
        System.out.println("calculando imposto do Tomate...");
        return this.valor*IMPOSTO_POR_CENTO;
    }
}
