package by.itacademy.hw7.Task3;

public class Apple extends Fruit {
    protected double applePricePerKilogram = 2.1;

    public Apple(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        price = weight * applePricePerKilogram;
        return price;
    }
}
