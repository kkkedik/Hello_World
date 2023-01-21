package by.itacademy.hw10.Task4;

import java.util.Comparator;

public class NicknameComparator implements Comparator<Pet> {
    public int compare(Pet pet1, Pet pet2){
        return pet1.getNickname().compareTo(pet2.getNickname());

    }
}
