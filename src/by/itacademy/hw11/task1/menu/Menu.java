package by.itacademy.hw11.task1.menu;

import by.itacademy.hw11.task1.UserRepository;
import by.itacademy.hw11.task1.exceptions.WrongLoginException;
import by.itacademy.hw11.task1.exceptions.WrongPasswordException;
import by.itacademy.hw11.task1.menu.action.MenuAction;
import by.itacademy.hw11.task1.menu.action.SelectAction;

import java.awt.*;

public class Menu {

    private final  MenuAction menuAction = new MenuAction();
    public static void main(String[] args) {new Menu().showMenu();}

    public void showMenu(){
        UserRepository userRepository = UserRepository.getInstance();
        System.out.println("Главное меню\n" +
                    "1: Авторизация\n" +
                    "2: Регистрация\n" +
                    "3: Выход\n");

        boolean isExit = false;

        while (!isExit){
            switch (new SelectAction().getAction()){
                case 1:

                    menuAction.authorization();
                    showMenu();
                    break;
                case 2:
                    menuAction.registration();
                    showMenu();
                    break;
                case 3:
                    isExit = true;
                    return;
            }
        }

    }



    }





//        Scanner scanner = new Scanner(System.in);
//        UserRepository userRepository = UserRepository.getInstance();
//        //User loggedUser = null;
//        while (true) {
//            System.out.println("Главное меню\n" +
//                    "1: Регистрация\n" +
//                    "2: Вход\n" +
//                    "3: Выход\n");
//
//            int choice = scanner.nextInt();
//            try {
//
//                if (choice > 0 && choice < 4) {
//                    switch (choice) {
//                        case 1:
//                            Scanner scanner2 = new Scanner(System.in);
//
//                            String login = getLogin();
//                            String password = getPassword();
//
//                            System.out.println("Введите имя: ");
//                            String name = scanner2.nextLine();
//
//                            System.out.println("Введите фамилию: ");
//                            String surname = scanner2.nextLine();
//                            User user = new User(login, password, surname, name);
//                            userRepository.addUser(login, user);
//                            //loggedUser = user;
//                            System.out.println("Пользователь был зарегестрирован");
//                            break;
//                        case 2:
//                            login = getLogin();
//                            User user1 = userRepository.checkUser(login);
//                            password = getPassword();
//                            if (!user1.getPassword().equals(password)) {
//                                throw new WrongPasswordException("Неверный пароль");
//                            }
//                            System.out.println("Вы вошли!");
//                            break;
//                        case 3:
//                            return;
//                    }
//
//                } else {
//                    System.out.println("Введено неверное число");
//                }
//            } catch (WrongPasswordException | WrongLoginException | UserNotExistException ex) {
//                System.out.println(ex.getMessage());
//            }
//
//        }
//
//    }
//
//    public static String getLogin() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите логин: ");
//        String login = scanner.nextLine();
//        if (!login.matches("[\\w]{5,20}+@[a-zA-z]{2,}+[.][a-z]{2,6}")) {
//            throw new WrongLoginException("Некоректный логин!");
//        }
//        return login;
//    }
//
//    public static String getPassword() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите пароль: ");
//        String password = scanner.nextLine();
//        if (!password.matches("[\\w]{8,}")) {
//            throw new WrongPasswordException("Некорректный пароль!");
//        }
//        return password;
//    }
//}
