package by.itacademy.hw13.task3;

public class Main {

    static class Runner implements Runnable {
        private MyInteger num;

        Runner(MyInteger num) {
            this.num = num;
        }

        @Override
        public void run() {
            num.print100AndIncrement();
        }
    }

    public static void main(String[] args) {
        MyInteger num = new MyInteger(1);

        Runner r1 = new Runner(num);
        Thread t1 = new Thread(r1);
        t1.start();

        Runner r2 = new Runner(num);
        Thread t2 = new Thread(r2);
        t2.start();

        Runner r3 = new Runner(num);
        Thread t3 = new Thread(r3);
        t3.start();

    }
}
