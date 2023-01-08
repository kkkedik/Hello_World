package by.itacademy.hw7.Task3;

public class Pear extends Fruit {

    public Pear(double weight) {
        super(weight);
    }

    public double getPrice() {
        price = super.weight * super.pearPricePerKilogram;
        return price;
    }
}
