package org.maratonajava.introducaoDados;

public class Aula07Arrays1 {
    public static void main(String[] args) {

        int [] idades = new int[3];
        idades[0] = 11;
        idades[1]= 22;
        idades[2]=33;

        System.out.println(idades[2]);

        String[] nomes = new String[3];
        nomes[0] = "A";
        nomes[1] = "B";
        nomes[2] = "C";
      //nomes[3] = "D"; // arrayindexoutofbounds

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
