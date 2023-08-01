package org.maratonajava.javacore.streams.dominio;

public class Novel {

    private String title;
    private double price;


    public Novel (String title, double price){
        this.title=title;
        this.price=price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Novel "+ title + ", Preço: "+ price;
    }
}
