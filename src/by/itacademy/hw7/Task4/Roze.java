package by.itacademy.hw7.Task4;

public class Roze extends Flower {
    protected double price = 5;

    public Roze(String color, int daysFade) {
        super(color, daysFade);
    }

    public double getPrice() {
        return price;
    }

    public void getColor() {
        System.out.println(color);
    }
}
