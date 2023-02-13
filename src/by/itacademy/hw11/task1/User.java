package by.itacademy.hw11.task1;

import java.time.LocalDateTime;

public class User {
    private String login;
    private String name;
    private String surname;
    private String password;
    private LocalDateTime registrationDate;
    private LocalDateTime lastAuthorizationDate;

    public User(String login, String password, LocalDateTime lastAuthorizationDate) {
        this.login = login;
        this.password = password;
        this.lastAuthorizationDate = lastAuthorizationDate;
        if (registrationDate == null) {
            registrationDate = lastAuthorizationDate;
        }
    }


    public void setLastAuthorizationDate(LocalDateTime lastAuthorizationDate) {
        this.lastAuthorizationDate = lastAuthorizationDate;
    }

    public String getPassword() {
        return password;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
}
