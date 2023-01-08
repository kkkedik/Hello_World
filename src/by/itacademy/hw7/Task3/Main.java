package by.itacademy.hw7.Task3;

public class Main {
    public static void main(String[] args) {
        double totalCost = 0;
        double appleCost = 0;
        double apricotCost = 0;
        double pearCost = 0;

        Fruit fruit = new Fruit(1.37);
        fruit.printManufacturerInfo();

        Pear pear1 = new Pear(4.12);
        Pear pear2 = new Pear(2.86);

        Apple apple1 = new Apple(8.51);
        Apple apple2 = new Apple(7.27);

        Apricot apricot1 = new Apricot(2.53);
        Apricot apricot2 = new Apricot(0.97);

        Fruit[] basket = new Fruit[6];
        basket[0] = apple1;
        basket[1] = apricot2;
        basket[2] = pear2;
        basket[3] = apricot1;
        basket[4] = pear2;
        basket[5] = apple2;

        for (int i = 0; i < basket.length; i++) {
            if (basket[i] instanceof Apple) {
                totalCost += apple1.getPrice();
                appleCost += apple1.getPrice();
            }
            if (basket[i] instanceof Pear) {
                totalCost += pear1.getPrice();
                pearCost += pear1.getPrice();
            }
            if (basket[i] instanceof Apricot) {
                totalCost += apricot1.getPrice();
                apricotCost += apricot1.getPrice();
            }
        }
        System.out.println("Общая стоимость корзины фруктов: " + totalCost +
                "\nСтоимость яблок: " + appleCost +
                "\nСтоимость груш: " + pearCost +
                "\nСтоимость абрикосов: " + apricotCost);
    }
}
