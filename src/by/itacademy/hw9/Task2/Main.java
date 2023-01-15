package by.itacademy.hw9.Task2;

public class Main {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("4232", "fbk hk");
        Pair<Integer> pair1 = new Pair<>(214, 453);
        pair.printValues();
        pair.swapValue();
        pair.printValues();
        pair.setFirstValue("Это Гаврик, он поёт");
        pair.setSecValue("Это шарик, он поёт");
        pair.printValues();
        pair1.setSecValue(3423);
        System.out.println(pair1.getValue1());
        pair1.setFirstValue(52324);
        System.out.println(pair1.getValue2());
    }
}
