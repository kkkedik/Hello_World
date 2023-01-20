package by.itacademy.hw7.Task4;

public class Lily extends Flower {
    protected double lilyPrice = 8;

    public Lily(String color, int daysFade) {
        super(color, daysFade);
    }

    @Override
    public double getPrice() {
        return lilyPrice;
    }
}
