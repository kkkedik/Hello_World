package by.itacademy.hw7.Task3;

import java.util.List;

public class Basket {
    private double totalCost;
    private double appleCost;
    private double pearCost;
    private double apricotCost;
    private List<Fruit> listOfFruits;

    public void setListOfFruits(List<Fruit> listOfFruits) {
        this.listOfFruits = listOfFruits;
    }


    public void getTotalCost() {
        for (int i = 0; i < listOfFruits.size(); i++) {
            totalCost += listOfFruits.get(i).getPrice();
        }
    }

    //    public void getTotalCostByPrice(Class fruitClass) {
//        for (int i = 0; i < listOfFruits.size(); i++) {
//            appleCost += listOfFruits.get(i).getPrice();
//
//        }
//    }
    public void getTotalCostByPrice(Class<?> fruitClass) {
        for (int i = 0; i < listOfFruits.size(); i++) {
            if (listOfFruits.get(i) instanceof Apple) {
                appleCost += listOfFruits.get(i).getPrice();
            }
        }
    }

    public void getCosts() {
        for (int i = 0; i < listOfFruits.size(); i++) {
            if (listOfFruits.get(i) instanceof Apple) {
                appleCost += listOfFruits.get(i).getPrice();
            }
            if (listOfFruits.get(i) instanceof Pear) {
                pearCost += listOfFruits.get(i).getPrice();
            }
            if (listOfFruits.get(i) instanceof Apricot) {
                apricotCost += listOfFruits.get(i).getPrice();
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

