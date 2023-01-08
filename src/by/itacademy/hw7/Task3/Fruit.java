package by.itacademy.hw7.Task3;

public class Fruit {
    protected double weight;
    protected double price = 1;
    protected double applePricePerKilogram = 2.1;
    protected double pearPricePerKilogram = 3.6;
    protected double apricotPricePerKilogram = 9.2;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public void printManufacturerInfo() {
        System.out.print("Made in Belarus\n");
    }

    public double getPrice() {
        return weight * price;
    }
}
