package by.itacademy.hw11.task1.menu;

import by.itacademy.hw11.task1.UserRepository;
import by.itacademy.hw11.task1.exceptions.WrongLoginException;
import by.itacademy.hw11.task1.exceptions.WrongPasswordException;
import by.itacademy.hw11.task1.menu.action.MenuAction;
import by.itacademy.hw11.task1.menu.action.SelectAction;

import java.awt.*;

public class Menu {

    private final MenuAction menuAction = new MenuAction();

    public static void main(String[] args) {
        new Menu().showMenu();
    }

    public void showMenu() {
        UserRepository userRepository = UserRepository.getInstance();
        System.out.println("Главное меню\n" +
                "1: Авторизация\n" +
                "2: Регистрация\n" +
                "3: Запрос пользователей по времени регистрации\n" +
                "4: Выход\n");

        boolean isExit = false;

        while (!isExit) {
            switch (new SelectAction().getAction()) {
                case 1:
                    menuAction.authorization();
                    showMenu();
                    break;
                case 2:
                    menuAction.registration();
                    showMenu();
                    break;
                case 3:
                    menuAction.getUsersByRegistrationDate();
                    showMenu();
                    break;
                case 4:
                    isExit = true;
                    return;
            }
        }

    }
}