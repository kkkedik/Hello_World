package by.itacademy.hw7.Task3;

public class Pear extends Fruit {


    protected double pearPricePerKilogram = 3.6;
    protected double totalAppleCostInBasket = 0;

    public Pear(double weight) {
        super(weight);
    }

    @Override
    public double getPrice() {
        price = weight * pearPricePerKilogram;
        return price;
    }
}
