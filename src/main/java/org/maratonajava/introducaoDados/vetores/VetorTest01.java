package org.maratonajava.introducaoDados.vetores;

import java.util.Scanner;

public class VetorTest01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o número de itens do vetor?: ");
        int n = sc.nextInt();
        double[] vetor = new double[n];


        System.out.println("Digite os valores: ");
        for (int i=0; i < n; i++){
            vetor[i] = sc.nextDouble();
        }

        sc.close();

        double soma = 0.0;
        for(int i = 0; i<n; i++){
            soma+=vetor[i];
        }
        double avg = soma / n;

        System.out.println(avg);
    }
}
