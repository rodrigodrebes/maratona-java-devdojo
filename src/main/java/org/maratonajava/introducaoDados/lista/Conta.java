package org.maratonajava.introducaoDados.lista;

public class Conta {
    private int numero;
    private String nomeUsuario;
    private double saldo;

    public Conta(int numero, String nomeUsuario, double saldo){
        this.numero=numero;
        this.nomeUsuario=nomeUsuario;
        this.saldo=saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
