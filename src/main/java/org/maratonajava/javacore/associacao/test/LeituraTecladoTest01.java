package org.maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        // classe Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = input.next().charAt(0);

        System.out.println("Seu nome é "+nome+", sua iadde é "+idade+", sexo "+sexo);

    }


}
