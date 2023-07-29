package org.maratonajava.javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;



    public Funcionario(String nome){
        super(nome);
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Salário "+ this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+ this.nome + " recebo "+this.salario + " Reais");
    }
}
