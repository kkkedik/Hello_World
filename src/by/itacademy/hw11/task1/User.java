package by.itacademy.hw11.task1;

import java.time.LocalDateTime;

public class User {
    private String login;
    private String name;
    private String surname;
    private String password;
    private LocalDateTime registrationDate;
    private LocalDateTime lastAuthorizationDate;

    public User(String login, String password, LocalDateTime registrationDate) {
        this.login = login;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLastAuthorizationDate(LocalDateTime lastAuthorizationDate) {
        this.lastAuthorizationDate = lastAuthorizationDate;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public String getPassword() {
        return password;
    }
}
