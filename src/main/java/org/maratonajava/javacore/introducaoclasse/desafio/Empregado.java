package org.maratonajava.javacore.introducaoclasse.desafio;

public class Empregado {
    private String nome;
    private int horasTrabalho;
    private double valorPorHora;

    public Empregado(String nome, int horasTrabalho, double valorPorHora){
        this.nome = nome;
        this.horasTrabalho = horasTrabalho;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double valorPago(){
        int valorpago = (int) (valorPorHora*horasTrabalho);
        return valorpago;
    }
}
