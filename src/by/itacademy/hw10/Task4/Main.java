package by.itacademy.hw10.Task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Pet petr = new Cat("petr", 12, 1000);
        Pet metr = new Dog("metr", 2, 2500);
        Pet loh = new Parrot("loh", 20, 100);
        PetShop petShop = new PetShop();
        petShop.addPetToJournal(petr);
        petShop.addPetToJournal(metr);
        petShop.addPetToJournal(loh);
        System.out.println("Меню, выберите действия \n1. Показать всех питомцев\n" +
                "2. Выход ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1) {
            petShop.showPets();
            System.out.println(petShop.toString());
            System.out.println("1. Сортировка по кличкам\n" +
                    "2. Сортировка по цене\n 3. Купить питомца\n" +
                    "4. Поиск по заданному диапазону\n" +
                    "5. Выход ");
            int num1 = scanner.nextInt();
            switch (num1) {
                case 1:
                    petShop.getPetsSortedByNickname();
                    System.out.println(petShop.getPetsSortedByNickname());
                    break;
                case 2:
                    System.out.println(petShop.getPetsSortedByPrice());
                    break;
                case 3:
                    petShop.buyPet(petr.getNickname());
                    System.out.println("Вы купили" + petr.getNickname());
                    petShop.showPets();
                    break;
                case 4:
                    System.out.println(petShop.findPetsByPrice(50, 2000));
                    break;
                case 5:
                    break;
            }
        } else {
            System.out.println("Выход");
        }
    }
}
