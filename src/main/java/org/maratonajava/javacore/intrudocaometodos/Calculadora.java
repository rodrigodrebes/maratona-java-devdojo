package org.maratonajava.javacore.intrudocaometodos;

public class Calculadora {

    public void soma(int n, int m){
        System.out.println(n+m);
    }

    public double divideDoisNros(double num1, double num2){
        if(num2 ==0){
            return 0;
        }
        return (int) (num1/num2);
    }
}
