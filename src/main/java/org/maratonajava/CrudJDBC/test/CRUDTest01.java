package org.maratonajava.CrudJDBC.test;

import org.maratonajava.CrudJDBC.service.ProducerService;

import java.util.Scanner;

public class CRUDTest01 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        while(true){
            producerMenu();
            op = Integer.parseInt(scanner.nextLine());
            if(op ==0) break;
            ProducerService.buildMenu(op);


        }
    }

private static void producerMenu(){
    System.out.println("Digite o número da sua operação:");
    System.out.println("1. Buscar por Produtora");
    System.out.println("0. Sair do Programa");
}
}
