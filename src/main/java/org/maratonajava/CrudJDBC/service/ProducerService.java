package org.maratonajava.CrudJDBC.service;

import org.maratonajava.CrudJDBC.dominio.Producer;
import org.maratonajava.CrudJDBC.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {

    private static Scanner scanner = new Scanner(System.in);

    public static void buildMenu(int op){
        switch(op){
            case 1: find();
            break;
            default:
                throw new IllegalArgumentException("Não é uma opção válida");

        }
    }

private static void find(){
    System.out.println("Digite o nome que deseja buscar");
    String name = scanner.nextLine();

    List<Producer> producers = ProducerRepository.findByName(name);
    if(producers.size() == 0){
        System.out.println("Não foi encontrado produtor com o nome " + name);
    } else {
        for (int i = 0;i < producers.size(); i++){
            System.out.println(i + " - " + producers.get(i).getName());
        }
    }
}
}


