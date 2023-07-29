package org.maratonajava.javacore.associacao.dominio;

public class Jogador {

    private String nome;

    // caso fosse necessário um Jogador ser necessariamente de um time, é boa prática adicionar isso ao construtor;
    private Time time;

    public Jogador(String nome){
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (time != null){
            System.out.println(time.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
