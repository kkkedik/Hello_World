package by.itacademy.hw6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        System.out.println(str.replaceAll("( )+", " ").trim());
    }
}
