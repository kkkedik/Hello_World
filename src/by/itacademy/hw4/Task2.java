package by.itacademy.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a, sum = 0;
        int productOfNum = 1;
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            a = scn.nextInt();
            while (a != 0) {
                sum = sum + a % 10;
                productOfNum = productOfNum * (a % 10);
                a /= 10;
            }
            System.out.println("Сумма всех чисел введенного числа равна " + sum);
            System.out.println("Произведение всех чисел введенного числа равна " + productOfNum);
        } else System.out.println("Ошибка. Вы ввели не число!");
    }
}

