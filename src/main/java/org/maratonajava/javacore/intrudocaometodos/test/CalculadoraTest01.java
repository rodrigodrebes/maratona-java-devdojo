package org.maratonajava.javacore.intrudocaometodos.test;

import org.maratonajava.javacore.intrudocaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.soma(2,5);
        System.out.println(calc.divideDoisNros(20,10));
        System.out.println(calc.divideDoisNros(20,0));
    }
}
