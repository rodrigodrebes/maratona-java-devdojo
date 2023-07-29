package org.maratonajava.javacore.introducaoclasse.desafio;

public class EmpregadoTerceirizado extends Empregado {


    public EmpregadoTerceirizado(String nome, int horasTrabalho, double valorPorHora) {
        super(nome, horasTrabalho, valorPorHora*1.1);
    }

}
