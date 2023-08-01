package org.maratonajava.CrudJDBC.test;

import org.maratonajava.CrudJDBC.service.ProducerService;

import java.util.Scanner;

public class CRUDTest01 {

    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        while(true){
            producerMenu();
            op = Integer.parseInt(SCANNER.nextLine());
            if(op ==0) break;
            ProducerService.menu(op);


        }
    }

private static void producerMenu(){
    System.out.println("Digite o número da sua operação:");
    System.out.println("1. Buscar por Produtora");
    System.out.println("2. Deletar Produtor");
    System.out.println("3. Salvar Produtor");
    System.out.println("0. Sair do Programa");
}
}
