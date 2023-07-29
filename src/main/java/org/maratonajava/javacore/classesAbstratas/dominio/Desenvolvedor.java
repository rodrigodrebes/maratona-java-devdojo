package org.maratonajava.javacore.classesAbstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public String toString(){
        return "Desenvolvedor: "+ nome +
                ", salário: "+salario;
    }

    @Override
    public void calculaBonus(){
        this.salario += this.salario * 0.2;
    }

}
