package org.maratonajava.javacore.construtores.dominio;

public class Produto {
    private String name;
    private double price;
    private int quantity;


    public Produto(String nome, double price, int quantity) {
        this.name = nome;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString(){
        return "Nome do produto: " + name + "\nPreço: " + price + "\nQuantidade: "+ quantity;
    }

}
