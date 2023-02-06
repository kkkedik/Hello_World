package by.itacademy.hw7.Task4;

public class Tulip extends Flower {
    protected double tulipPrice = 3;


    public Tulip(String color, int daysFade) {
        super(color, daysFade);
    }

    @Override
    public double getPrice() {
        return tulipPrice;
    }
}
