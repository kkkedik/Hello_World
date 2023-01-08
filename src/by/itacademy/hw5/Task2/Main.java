package by.itacademy.hw5.Task2;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone();
        Phone honor = new Phone("+37529285", "x70", 189);
        Phone googlePixel = new Phone("+37529342", "7 Pro");

        iPhone.receiveCall("Vlad");
        honor.receiveCall("Ira");
        googlePixel.receiveCall("ВОЕНКОМАТ");

        System.out.println(iPhone.getNumber());
        System.out.println(honor.getNumber());
        System.out.println(googlePixel.getNumber());

        iPhone.sendMassage("8029142", "+235414");
        honor.sendMassage("+1523524", "+342752382", "82353528");
        googlePixel.sendMassage();

        iPhone.receiveCall("Andrei", "+32623");
        honor.receiveCall("Petr", "8023532352");
        googlePixel.receiveCall("GAI", "102");

    }
}
