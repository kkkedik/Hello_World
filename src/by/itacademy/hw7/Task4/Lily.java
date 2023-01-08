package by.itacademy.hw7.Task4;

public class Lily extends Flower {
    protected double price = 5;

    public Lily(String color, int daysFade) {
        super(color, daysFade);
    }

    public double getPrice() {
        return price;
    }

    public void getColor() {
        System.out.println(color);
    }
}
