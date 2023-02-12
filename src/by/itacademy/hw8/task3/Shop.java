package by.itacademy.hw8.task3;

import by.itacademy.hw8.task3.cloth.*;
import by.itacademy.hw8.task3.shoes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Sweatshirt sweatshirt = new Sweatshirt("Adidas", ClothesSize.S, ClothesColors.BLUE);
        Boots boots = new Boots("Abibasss", ShoesSize.SIZE42, ShoesColors.GREEN);
        Hat hat = new Hat("Gryas", ClothesSize.XL, ClothesColors.RED);
        Moccasins moccasins = new Moccasins("Blood", ShoesSize.SIZE38, ShoesColors.WHITE);
        Sneakers sneakers = new Sneakers("Neman", ShoesSize.SIZE39, ShoesColors.YELLOW);
        Trousers trousers = new Trousers("Reebok", ClothesSize.M, ClothesColors.GREEN);

        List<Product> products = new ArrayList<>();
        products.add(sweatshirt);
        products.add(boots);
        products.add(hat);
        products.add(moccasins);
        products.add(sneakers);
        products.add(trousers);

        while (products.size() > 0) {
            printList(products);
            System.out.println("Введите номер продукта который вы желаете купить: ");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            if (index < 0 || index >= products.size()) {
                System.out.println("Выход из программы, вы ввели неверное значение.");
                break;
            }
            System.out.println("Вы купили: " + products.remove(index).name);
        }

    }

    public static void printList(List<Product> products) {
        int index = 1;
        for (Product item : products) {
            System.out.println(index++ + ". " + item.name);
        }
    }

    public static void searchBySize(List<Product> products, ClothesColors color) {
        int index = 0;
        for (Product item : products) {
//            if (color.equals()) {
//            }
            System.out.println(index++ + ". " + item.name);
        }
    }

}
