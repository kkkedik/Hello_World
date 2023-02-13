package by.itacademy.hw11.task1.service;

import by.itacademy.hw11.task1.User;
import by.itacademy.hw11.task1.UserRepository;
import by.itacademy.hw11.task1.exceptions.UserAlreadyExists;
import by.itacademy.hw11.task1.exceptions.UserNotExistException;
import by.itacademy.hw11.task1.exceptions.WrongLoginException;
import by.itacademy.hw11.task1.exceptions.WrongPasswordException;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;

public class UserService {
    private static final String PASSWORD_REGEX = "[\\w]{8,}";
    private static final String LOGIN_REGEX = "[\\w]{5,20}+@[a-zA-z]{2,}+[.][a-z]{2,6}";
    private final Map<String, User> users = UserRepository.getInstance().getUsers();


    public void authorize(String login, String password) {

        User user = findUser(login).orElseThrow(() -> new UserNotExistException("Пользователя не существует"));

        if (user.getPassword().equals(password)) {
        } else {
            throw new WrongPasswordException("Неверный пароль");
        }

    }

    public void register(String login, String password) {
        if (!login.matches(LOGIN_REGEX)) {
            throw new WrongLoginException("неверно введён логин");
        }


        if (!password.matches(PASSWORD_REGEX)) {
            throw new WrongPasswordException("некорректный пароль");
        }
        if (findUser(login).isEmpty()) {
            LocalDateTime localDateTime = LocalDateTime.now();
            users.put(login, new User(login, password, localDateTime));
        } else {
            throw new UserAlreadyExists("пользователь с таким логином уще существует");
        }

    }

    private Optional<User> findUser(String login) {
        return Optional.ofNullable(users.get(login));
    }

//    public User checkUser(String key) {
//        User user = (User) users.get(key);
//        if (user == null) {
//            throw new UserNotExistException("Пользователь с таким логином не найден");
//        }
//        return user;
//    }
//
//    public void addUser(String key, User user) {
//        users.put(key, user);
//    }
//
//    public static UserService getInstance() {
//
//        if (instance == null) {
//            return new UserService();
//        }
//        return instance;
//    }
}
