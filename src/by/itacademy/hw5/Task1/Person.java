package by.itacademy.hw5.Task1;

public class Person {
    private String fullName;
    private int age;

    Person() {
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // создал сеттеры и геттеры для повторения, конструкция условия
    // (относительно того свободен параметр или нет)
    // в лекции ты говорила выполняется в классе, где вызывется
    // исходя из этого не писал

    public String getFullName() {
        return fullName;
    }

    // условие в методах добавил от себя для проверки работы
    public void move() {
        if (this.fullName == null) {
            System.out.println("Имя пользователя отсутсвует");
        } else {
            System.out.println(this.fullName + " говорит");
        }
    }

    public void talk() {
        if (this.fullName == null) {
            System.out.println("Имя пользователя отсутсвует");
        } else {
            System.out.println(this.fullName + " говорит");
        }
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

