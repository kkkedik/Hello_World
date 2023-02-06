package by.itacademy.hw7.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pear pear1 = new Pear(4.12);
        Pear pear2 = new Pear(2.86);

        Apple apple1 = new Apple(8.51);
        Apple apple2 = new Apple(7.27);

        Apricot apricot1 = new Apricot(2.53);
        Apricot apricot2 = new Apricot(0.97);

        List<Fruit> listOfFruits = new ArrayList<>();
        listOfFruits.add(apple1);
        listOfFruits.add(apple2);
        listOfFruits.add(pear1);
        listOfFruits.add(pear2);
        listOfFruits.add(apricot1);
        listOfFruits.add(apricot2);

        Basket basket = new Basket();
        basket.setListOfFruits(listOfFruits);
        basket.getTotalCost();
        System.out.println("Apple: " + basket.getTotalCostByPrice(Apple.class));
        System.out.println("Apricot: " + basket.getTotalCostByPrice(Apricot.class));
        System.out.println("Pear: " + basket.getTotalCostByPrice(Pear.class));
        System.out.println("Total cost: " + basket.getTotalCost());

    }
}
