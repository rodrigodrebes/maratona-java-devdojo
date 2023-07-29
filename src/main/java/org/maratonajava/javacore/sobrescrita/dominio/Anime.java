package org.maratonajava.javacore.sobrescrita.dominio;

public class Anime {

    private String nome;

    public Anime(String nome){
        this.nome=nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // método toString
    @Override
    public String toString() {
        return "Anime de " +
                "nome: " + nome;
    }
}
