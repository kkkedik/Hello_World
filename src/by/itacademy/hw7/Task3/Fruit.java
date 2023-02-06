package by.itacademy.hw7.Task3;

public abstract class Fruit extends Basket {
    protected double weight;
    protected double price = 1;

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
