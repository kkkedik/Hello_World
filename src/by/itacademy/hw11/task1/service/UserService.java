package by.itacademy.hw11.task1.service;

import by.itacademy.hw11.task1.User;
import by.itacademy.hw11.task1.UserRepository;
import by.itacademy.hw11.task1.exceptions.UserAlreadyExistsException;
import by.itacademy.hw11.task1.exceptions.UserNotExistException;
import by.itacademy.hw11.task1.exceptions.WrongLoginException;
import by.itacademy.hw11.task1.exceptions.WrongPasswordException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UserService {
    private static final String PASSWORD_REGEX = "[\\w]{8,}";
    private static final String LOGIN_REGEX = "[\\w]{5,20}+@[a-zA-z]{2,}+[.][a-z]{2,6}";
    private final UserRepository userRepository = UserRepository.getInstance();


    public void authorize(String login, String password) {

        User user = findUser(login).orElseThrow(() -> new UserNotExistException("Пользователя не существует"));

        if (user.getPassword().equals(password)) {
        } else {
            throw new WrongPasswordException("Неверный пароль");
        }
        LocalDateTime localDateTime = LocalDateTime.now();
        user.setLastAuthorizationDate(localDateTime);

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
            userRepository.saveUser(new User(login, password, localDateTime));
        } else {
            throw new UserAlreadyExistsException("пользователь с таким логином уще существует");
        }

    }

    public List<User> getUsersByRegistrationDate(LocalDateTime startTime, LocalDateTime endTime) {
        return userRepository.getUsersByRegistrationDate(startTime, endTime);
    }

    private Optional<User> findUser(String login) {
        return Optional.ofNullable(userRepository.getUser(login));
    }
}