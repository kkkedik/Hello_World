package by.itacademy.hw13.task3;

public class MyInteger {
    Integer num;
//    Boolean busy = false;

    public MyInteger(Integer num) {
        this.num = num;
    }

    public synchronized void print100AndIncrement() {
        for (int i = 0; i < 100; i++) {
            System.out.print(num);
        }
        num++;
        System.out.println();
    }

}
