package by.itacademy.hw13.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " число массива: ");
            array[i] = scanner.nextDouble();
        }

        MyDouble max = new MyDouble(0.);
        MyDouble min = new MyDouble(0.);

        Runner1 runner1 = new Runner1(array, max);
        Thread t1 = new Thread(runner1);
        t1.start();

        Runner2 runner2 = new Runner2(array, min);
        Thread t2 = new Thread(runner2);
        t2.start();
        while (t1.isAlive() || t2.isAlive()) {
            Thread.sleep(1000);
        }

        System.out.println("max: " + max.getNum());
        System.out.println("min: " + min.getNum());

    }

    static class Runner1 implements Runnable {
        private double[] array;
        MyDouble max;

        public Runner1(double[] array, MyDouble max) {
            this.array = array;
            this.max = max;
        }

        @Override
        public void run() {
            Arrays.sort(array);
            max.setNum(array[array.length - 1]);
        }
    }

    static class Runner2 implements Runnable {
        private double[] array;
        MyDouble min;

        public Runner2(double[] array, MyDouble min) {
            this.array = array;
            this.min = min;
        }

        @Override
        public void run() {
            Arrays.sort(array);
            min.setNum(array[0]);
        }
    }

}

