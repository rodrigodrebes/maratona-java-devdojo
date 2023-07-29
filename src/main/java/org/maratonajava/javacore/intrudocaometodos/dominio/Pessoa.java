package org.maratonajava.javacore.intrudocaometodos.dominio;

public class Pessoa {

    private String nome;
    private int idade;
    private double[] salarios;

    private double media =0;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void mediaSalario(){
        if (salarios == null){return;}

        for (double salario : salarios){
            media+=salario;

        }
        media /= salarios.length;

    }

    public double getMedia() {
        return media;
    }
}
