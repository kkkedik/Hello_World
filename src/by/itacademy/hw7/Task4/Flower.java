package by.itacademy.hw7.Task4;

public abstract class Flower extends Bouquet {
    protected String color;
    protected double price;
    protected int daysFade;

    public Flower(String color, int daysFade) {
        this.color = color;
        this.daysFade = daysFade;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
