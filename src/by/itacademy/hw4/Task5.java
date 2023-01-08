package by.itacademy.hw4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0, p = 1; i < array.length; i++, p++) {
            System.out.println("Введите " + p + " число массива : ");
            array[i] = scanner.nextInt();
            for (; array[i] < -100000; ) {
                System.out.println("Введите " + p + " число массива от - 100000 до +бесконечности: ");
                array[i] = scanner.nextInt();
            }
        }
        System.out.println("Минимальный элемент массива с нечетным индексом: " + getMIn(array));
    }

    private static int getMIn(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; ) {
            if (array[i] < min) {
                min = array[i];
                i += 2;
            }
        }
        return min;
    }
}
