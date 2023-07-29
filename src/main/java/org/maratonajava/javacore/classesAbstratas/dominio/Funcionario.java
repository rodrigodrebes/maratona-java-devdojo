package org.maratonajava.javacore.classesAbstratas.dominio;

// classes abstratas não podem ser instancias
// foram criadas para serem estendidas por Herança

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;

    }
    @Override
    public String toString(){
        return "Funcionario: "+ nome +
                ", salário: "+ salario;
    }

    // delega às subclasses a implementação
    public abstract void calculaBonus();
}
