package org.maratonajava.javacore.streams.dominio;

public class Novel {

    private String title;
    private double price;

    private Category category;


    public Novel (String title, double price, Category category){
        this.title=title;
        this.price=price;
        this.category = category;
    }
    public Novel (String title, double price){
        this.title=title;
        this.price=price;

    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
    public String toString() {
        return "Novel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
