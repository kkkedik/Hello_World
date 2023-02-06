package by.itacademy.hw11.task1;

import by.itacademy.hw11.task1.exceptions.UserNotExistException;
import by.itacademy.hw11.task1.exceptions.WrongLoginException;
import by.itacademy.hw11.task1.exceptions.WrongPasswordException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Scanner scanner = new Scanner(System.in);
        UserRepository userRepository = UserRepository.getInstance();
        //User loggedUser = null;
        while (true) {
            System.out.println("Главное меню\n" +
                    "1: Регистрация\n" +
                    "2: Вход\n" +
                    "3: Выход\n");

            int choice = scanner.nextInt();
            try {

                if (choice > 0 && choice < 4) {
                    switch (choice) {
                        case 1:
                            Scanner scanner2 = new Scanner(System.in);

                            String login = getLogin();
                            String password = getPassword();

                            System.out.println("Введите имя: ");
                            String name = scanner2.nextLine();

                            System.out.println("Введите фамилию: ");
                            String surname = scanner2.nextLine();
                            User user = new User(login, password, surname, name);
                            userRepository.addUser(login, user);
                            //loggedUser = user;
                            System.out.println("Пользователь был зарегестрирован");
                            break;
                        case 2:
                            login = getLogin();
                            User user1 = userRepository.checkUser(login);
                            password = getPassword();
                            if (!user1.getPassword().equals(password)) {
                                throw new WrongPasswordException("Неверный пароль");
                            }
                            //else {
                            // loggedUser = user1;
                            //}
                            System.out.println("Вы вошли!");
                            break;
                        case 3:
                            return;
                        //  System.exit(0);
                        //  break;
                    }

                } else {
                    System.out.println("Введено неверное число");
                }
            } catch (WrongPasswordException | WrongLoginException | UserNotExistException ex) {
                System.out.println(ex.getMessage());
            }

        }

    }

    public static String getLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        if (!login.matches("[\\w]{5,20}+@[a-zA-z]{2,}+[.][a-z]{2,6}")) {
            throw new WrongLoginException("Некоректный логин!");
        }
        return login;
    }

    public static String getPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        if (!password.matches("[\\w]{8,}")) {
            throw new WrongPasswordException("Некорректный пароль!");
        }
        return password;
    }
}
