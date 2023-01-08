package by.itacademy.hw6;

public class Task9 {
    public static void main(String[] args) {
        String str = "myemail@gmail.com";
        //    System.out.println(str.matches("[a-fA-F0-9]{3}|#?[a-fA-F0-9]{6}"));
        System.out.println(str.matches("[\\w[-.]]+@[\\w[-.]]+[.][a-z]{2,6}$"));
    }
}
