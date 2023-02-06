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
// используя ключик и значение мы записываем в мэп(именно по ключик и значение)
    // и проверяем
    // логин, если есть, то надо проверять пароль, если нету, кидаем ошибочку
    // 2 метода гет юзер (принимает логин) ищет юзера и отдаёт юзера
    // добавление юзера (метод 2) , принимает 2 строки логин и пароль, создаёт юзера с логином и паролем и добавляет в мэп
    //UserRepository.getIns...
}
