package by.itacademy.hw11.task1.menu.action;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SelectAction {
    private final Scanner scanner = new Scanner(System.in);

    private int action;

    public SelectAction() {
        selectAction();
    }

    public int getAction() {
        return action;
    }

    private void selectAction() {
        action = 0;
        try {
            action = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введённая строка не число, повтори, а");
        }
        if (action < 0 || action > 3){
            System.out.println("неверно, введите от 1 до 4");
        }
    }

}
