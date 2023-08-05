package org.maratonajava.javacore.lambdas.dominio;

public class Car {
    private String color;

    private int year;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
