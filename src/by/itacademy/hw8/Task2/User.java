package by.itacademy.hw8.Task2;

public class User {
    private String password;
    private String login;

    public User(String password, String login) {
        this.password = password;
        this.login = login;
    }

    public class Query {
        public void printToLog() {
            System.out.printf("Пользователь с логином: %s и паролем: %s отправил запрос.", login, password);
        }
    }
}
