package by.itacademy.hw7.Task3;

import java.util.List;

public class Basket {
    private List<Fruit> listOfFruits;

    public void setListOfFruits(List<Fruit> listOfFruits) {
        this.listOfFruits = listOfFruits;
    }


    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < listOfFruits.size(); i++) {
            totalCost += listOfFruits.get(i).getPrice();
        }
        return totalCost;
    }

    public double getTotalCostByPrice(Class<?> fruitClass) {
        double totalPrice = 0;
        for (int i = 0; i < listOfFruits.size(); i++) {
            if (fruitClass.isInstance(listOfFruits.get(i))) {
                totalPrice += listOfFruits.get(i).getPrice();
            }
        }
        return totalPrice;
    }
}

