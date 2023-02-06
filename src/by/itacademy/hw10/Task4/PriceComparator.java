package by.itacademy.hw10.Task4;

import java.util.Comparator;

public class PriceComparator implements Comparator<Pet> {
    public int compare(Pet pet1, Pet pet2) {
        return Double.compare(pet1.getPrice(), pet2.getPrice());
    }
}
