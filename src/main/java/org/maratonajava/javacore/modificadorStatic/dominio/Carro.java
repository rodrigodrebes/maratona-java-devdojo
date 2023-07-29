package org.maratonajava.javacore.modificadorStatic.dominio;

public class Carro {

    private String marca;
    private double velocidadeMaxima;

    // modificador estático (static)
    // "metadado" que pertence à toda Classe
    // indicado quando métodos não acessam atributos da instância
    private static double velocidadeLimite = 250;

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Nome "+this.marca);
        System.out.println("Velocidade Máxima "+this.velocidadeMaxima);
        System.out.println("Velocidade Limite "+ Carro.velocidadeLimite);
    }

    public Carro(String marca, double velocidadeMaxima){
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public static void setVelocidadeLimite(double velocidadeLimite){
       Carro.velocidadeLimite = velocidadeLimite;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

}
