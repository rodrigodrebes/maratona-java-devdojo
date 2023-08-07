package org.maratonajava.javacore.construtores.test;

import org.maratonajava.javacore.construtores.dominio.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoTest01 {

    private static Scanner sc = new Scanner(System.in);
    private static List<Produto> listaDeProdutos = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");

            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            if (opt == 2) break;
        }

        for (Produto produto : listaDeProdutos) {
            System.out.println(produto+"\n");
        }
    }

    public static void adicionarProduto() {
        System.out.println("Digite o nome do Produto: ");
        String name = sc.nextLine();

        System.out.println("Preço: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.println("Quantidade: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        Produto produto = new Produto(name, price, quantity);
        listaDeProdutos.add(produto);
    }
}
