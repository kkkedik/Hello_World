package by.itacademy.hw11.task1;

import by.itacademy.hw11.task1.exceptions.UserNotExistException;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static UserRepository instance;
    Map<String, User> users = new HashMap<>();

    private UserRepository() {
    }

    public User checkUser(String key) {
        User user = (User) users.get(key);
        if (user == null) {
            throw new UserNotExistException("Пользователь с таким логином не найден");
        }
        return user;
    }

    public void addUser(String key, User user) {
        users.put(key, user);
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

}
