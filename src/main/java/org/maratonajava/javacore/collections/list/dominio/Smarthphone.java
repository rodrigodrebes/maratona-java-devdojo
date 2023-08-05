package org.maratonajava.javacore.collections.list.dominio;

public class Smarthphone {

    private String serialNumber;
    private String marca;

    public Smarthphone(String serialNumber, String marca){
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public String getMarca(){
        return marca;
    }

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String toString(){
        return "\nMarca: " + marca + "\nSerial: "+ serialNumber;
    }
}
