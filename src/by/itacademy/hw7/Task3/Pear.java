package by.itacademy.hw7.Task3;

public class Pear extends Fruit {

    public Pear(double weight) {
        this.weight = weight;
    }

    protected double pearPricePerKilogram = 3.6;

    @Override
    public double getPrice() {
        price = weight * pearPricePerKilogram;
        return price;
    }
}
