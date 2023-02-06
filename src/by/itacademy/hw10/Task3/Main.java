package by.itacademy.hw10.Task3;

public class Main {
    public static void main(String[] args) {

        Stack<Double> stack = new Stack<>();
        stack.push(2.2);
        stack.push(6.1);
        stack.push(7.2);
        System.out.println(stack.max());
        stack.pop();
        System.out.println(stack.max());
    }
}
