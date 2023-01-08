package by.itacademy.hw8.Task2;

public class Main {
    public static void main(String[] args) {
        User pavel = new User("qwerty123", "pavel123");
        User.Query query = pavel.new Query();
        query.printToLog();
    }
}
