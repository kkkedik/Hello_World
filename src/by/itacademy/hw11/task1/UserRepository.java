package by.itacademy.hw11.task1;

import by.itacademy.hw11.task1.exceptions.UserNotExistException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserRepository {
    private static UserRepository instance;
    private final Map<String, User> users = new HashMap<>();

    public Map<String, User> getUsers() {
        return users;
    }

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public User getUser(String login) {
        return users.get(login);
    }

    public List<User> getUsersByRegistrationDate(LocalDateTime startTime, LocalDateTime endTime) {

        return users.values().stream()
                .filter(user -> user.getRegistrationDate().isAfter(startTime) && user.getRegistrationDate().isBefore(endTime))
                .collect(Collectors.toList());
    }

    public void saveUser(User user) {
        users.put(user.getLogin(), user);
    }
}
