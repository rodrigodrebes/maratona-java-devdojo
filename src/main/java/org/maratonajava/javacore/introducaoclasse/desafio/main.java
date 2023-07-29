package org.maratonajava.javacore.introducaoclasse.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Crie duas Classes de Empregados, o Terceirizado deve ter um adicional. O usuário deve poder inserir Empregados e, após a inserção, o programa deve listá-los e seus ganhos.
public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Empregado> empregados = new ArrayList<>();

        while (true) {
            System.out.println("Digite o tipo de empregado (1 - normal, 2 - terceirizado) ou qualquer outro número para sair:");
            int tipo = scanner.nextInt();

            if (tipo != 1 && tipo != 2) {
                break;
            }

            System.out.println("Digite o nome do empregado:");
            String nome = scanner.next();

            System.out.println("Digite o número de horas trabalhadas:");
            int horasTrabalho = scanner.nextInt();

            System.out.println("Digite o valor por hora:");
            double valorPorHora = scanner.nextDouble();

            if (tipo == 1) {
                empregados.add(new Empregado(nome, horasTrabalho, valorPorHora));
            } else if (tipo == 2) {
                empregados.add(new EmpregadoTerceirizado(nome, horasTrabalho, valorPorHora));
            }
        }

        scanner.close();

        for (Empregado empregado : empregados) {
            System.out.println("O empregado " + empregado.getNome() + " será pago " + empregado.valorPago());
        }
    }
}
