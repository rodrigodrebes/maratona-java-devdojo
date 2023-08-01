package org.maratonajava.CrudJDBC.service;

import org.maratonajava.CrudJDBC.dominio.Producer;
import org.maratonajava.CrudJDBC.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

import static org.maratonajava.CrudJDBC.repository.ProducerRepository.findAll;
import static org.maratonajava.CrudJDBC.repository.ProducerRepository.findByName;

public class ProducerService {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op){
        switch(op){
            case 1: find();
            break;

            case 2:
                delete();
                break;
            default:
                throw new IllegalArgumentException("Não é uma opção válida");
        }
    }

private static void find(){
    System.out.println("Digite o nome que deseja buscar");
    String name = SCANNER.nextLine();

    List<Producer> producers = findByName(name);
    if(producers.size() == 0){
        System.out.println("Não foi encontrado produtor com o nome " + name);
    } else {
        for (int i = 0;i < producers.size(); i++){
            System.out.println(i + " - " + producers.get(i).getName());
        }
    }
}

private static void delete(){
        System.out.println("Digite o nome do Id que deseja deletar");
        List<Producer> producers = findAll();

        for (Producer producer : producers) {
        System.out.println(producer);
        }

        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Tem certeza que deseja deletar? S/N");
        System.out.println("Caso deseje sair, pressione qualquer outra tecla");
        String escolha = SCANNER.nextLine();
        if (escolha.toLowerCase().startsWith("s")){
            ProducerRepository.delete(id);
        }else{
            System.out.println("Operação de deleção cancelada pelo usuário.");
            return;
        }
    }









}


