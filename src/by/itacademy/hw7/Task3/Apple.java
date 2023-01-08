package by.itacademy.hw7.Task3;

public class Apple extends Fruit {

    public Apple(double weight) {
        super(weight);
    }

    public double getPrice() {
        price = super.weight * super.applePricePerKilogram;
        return price;
    }
}
