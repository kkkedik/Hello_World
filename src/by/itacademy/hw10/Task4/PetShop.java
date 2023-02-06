package by.itacademy.hw10.Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetShop {
    private Map<String, Pet> journal = new HashMap<>();

    public void showPets() {
        System.out.println(journal.toString());
    }

    public void addPetToJournal(Pet pet) {
        journal.put(pet.getNickname(), pet);
    }

    public void buyPet(String nickname) {
        journal.remove(nickname);
    }

    public List<Pet> getPetsSortedByNickname() {
        List<Pet> pets1 = new ArrayList<>(journal.values());
        pets1.sort(new NicknameComparator());
        return pets1;
    }

    public List<Pet> getPetsSortedByPrice() {
        List<Pet> pets1 = new ArrayList<>(journal.values());
        pets1.sort(new PriceComparator());
        return pets1;
    }


    public List<Pet> findPetsByPrice(double min, double max) {
        List<Pet> pets1 = new ArrayList<>(journal.values());
        for (Pet pet : pets1) {
            if (pet.getPrice() < min || pet.getPrice() > max) {
                pets1.remove(pet);
            }
        }
        return pets1;
    }
}
