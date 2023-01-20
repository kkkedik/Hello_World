package by.itacademy.hw7.Task4;

public class Chamomile extends Flower {
    protected double chamomilePrice = 1;

    public Chamomile(String color, int daysFade) {
        super(color, daysFade);
    }

    @Override
    public double getPrice() {
        return chamomilePrice;
    }
}
