package by.itacademy.hw11.task1;

import by.itacademy.hw11.task1.exceptions.UserNotExistException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static UserRepository instance;
    private final Map<String, User> users = new HashMap<>();
    LocalDateTime localDateTime = LocalDateTime.now();

    private UserRepository() {
        initUsers();
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public static UserRepository getInstance(){
        if (instance == null) {
            return new UserRepository();
        }
        return instance;
    }

    public void initUsers(){
        users.put("Login_1", new User("Login_1", "password_1", localDateTime));
        users.put("Login_2", new User("Login_2", "password_2", localDateTime));
    }

//    private UserRepository() {
//    }

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
//    public static UserRepository getInstance() {
//        if (instance == null) {
//            return new UserRepository();
//        }
//        return instance;
//    }

}
