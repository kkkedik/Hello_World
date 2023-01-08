package by.itacademy.hw7.Task3;

public class Apricot extends Fruit {

    public Apricot(double weight) {
        super(weight);
    }

    public double getPrice() {
        price = super.weight * super.apricotPricePerKilogram;
        return price;
    }
}
