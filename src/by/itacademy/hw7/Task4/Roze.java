package by.itacademy.hw7.Task4;

public class Roze extends Flower {
    protected double rozePrice = 5;

    public Roze(String color, int daysFade) {
        super(color, daysFade);
    }

    @Override
    public double getPrice() {
        return rozePrice;
    }
}
