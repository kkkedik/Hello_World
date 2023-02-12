package by.itacademy.hw11.task1.menu.action;

import by.itacademy.hw11.task1.exceptions.SystemLogException;
import by.itacademy.hw11.task1.service.UserService;

import java.util.Scanner;

public class MenuAction {
    private final UserService userService = new UserService();
    private final Scanner scanner = new Scanner(System.in);

    public void authorization() {
        String login = entryString("Login: ");
        String password = entryString("Password: ");
        try {
            userService.authorize(login, password);
        } catch (SystemLogException e){
            System.out.println("Ошибка авторизации "+ e.getMessage());
        }
        System.out.println("Welcome");
    }

    public void registration() {
        String login = entryString("Login: ");
        String password = entryString("Password: ");
        try {
            userService.register(login, password);
        } catch (SystemLogException e){
            System.out.println("Ошибка регистрации "+ e.getMessage());
        }
        System.out.println("Welcome");
    }

    private String entryString(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
