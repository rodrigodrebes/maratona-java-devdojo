package org.maratonajava;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 * numero02;

        System.out.println(numero01+numero02);
        System.out.println(resultado);

        // %
        int resto = 27%7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean dezEMaiorQueVinte = 10>20;
        boolean dezEMenorQueVinte = 10<20;
        boolean dezIgualAVinte = 10 == 20;
        System.out.println(dezIgualAVinte);
        System.out.println(dezEMaiorQueVinte);
        System.out.println(dezEMenorQueVinte);


        // && (AND) || (OR)
        int idade =35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >10 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <30 && salario >= 3381;
        System.out.println(isDentroDaLeiMenorQueTrinta);
        System.out.println(isDentroDaLeiMaiorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 3000;
        float valorProduto = 5000;

        boolean isProdutoCompravel = valorTotalContaCorrente >valorProduto || valorTotalContaPoupanca>valorProduto;

        System.out.println(isProdutoCompravel);


        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000;

        System.out.println(bonus);


        // incrementos = ++ --

        int contador = 0;
        contador++; // contador = contador +1;
        System.out.println(contador);
        contador--;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++); // primeiro executa e depois incrementa;
        System.out.println(contador2);

        int contador3 = 0;
        System.out.println(++contador3); // primeiro incrementa e depois executa;
    }
}
