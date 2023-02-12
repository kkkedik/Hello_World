package by.itacademy.hw11.task1;

public class User {
    private String login;
    private String name;
    private String surname;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, String surname, String name) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
