package by.itacademy.hw7.Task3;

public class Apricot extends Fruit {
    protected double apricotPricePerKilogram = 9.2;

    public Apricot(double weight) {
        super(weight);
    }


    @Override
    public double getPrice() {
        price = weight * apricotPricePerKilogram;
        return price;
    }
}
