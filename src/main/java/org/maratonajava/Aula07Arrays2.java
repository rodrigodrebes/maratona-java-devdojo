package org.maratonajava;

public class Aula07Arrays2 {
    public static void main(String[] args) {


        int[] numeros = {1,2,3,4,5};
// for regular
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);

        }
// forEach
        for (int num:numeros){
            System.out.println(num);
        }
    }
}
