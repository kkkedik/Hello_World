package by.itacademy.hw7.Task3;

import java.util.List;

public class Basket {
    private double totalCost;
    private double appleCost;
    private double pearCost;
    private double apricotCost;
    private List listOfFruits;

    public Basket(List list) {
        this.listOfFruits = list;
    }

    public void getTotalCost() {
        for (int i = 0; i < listOfFruits.size(); i++) {
            totalCost += ((Fruit) listOfFruits.get(i)).getPrice();
        }
    }

    public void getTotalCostByPrice(Class<?> fruitClass) {

    }

    public void getCosts() {
        for (int i = 0; i < listOfFruits.size(); i++) {
            if (listOfFruits.get(i) instanceof Apple) {
                appleCost += ((Apple) listOfFruits.get(i)).getPrice();
            }
            if (listOfFruits.get(i) instanceof Pear) {
                pearCost += ((Pear) listOfFruits.get(i)).getPrice();
            }
            if (listOfFruits.get(i) instanceof Apricot) {
                apricotCost += ((Apricot) listOfFruits.get(i)).getPrice();
            }
        }
    }

    public void showInfo() {
        System.out.println("Общая стоимость корзины фруктов: " + totalCost +
                "\nСтоимость яблок: " + appleCost +
                "\nСтоимость груш: " + pearCost +
                "\nСтоимость абрикосов: " + apricotCost);
    }
}

