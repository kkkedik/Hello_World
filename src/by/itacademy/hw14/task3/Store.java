package by.itacademy.hw14.task3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Store {

    private final int MAX_SIZE = 5;
    private final Semaphore producerSemaphore = new Semaphore(MAX_SIZE);
    private final Semaphore consumerSemaphore = new Semaphore(0);
    private final Lock lock = new ReentrantLock();

    private Integer count = 0;
    boolean locked;

    public void produce() {
        try {
            producerSemaphore.acquire();
        } catch (InterruptedException e) {
            System.out.println("Ошибочка оп и появилась: " + e);
        }

        while (!lock.tryLock()) {
            continue;
        }
        count++;
        System.out.println("Добавлен 1 товар, всего " + count);
        lock.unlock();
        consumerSemaphore.release();
    }

    public void buy() {
        try {
            consumerSemaphore.acquire();
        } catch (InterruptedException e) {
            System.out.println("Ошибочка оп и появилась: " + e);
        }

        while (!lock.tryLock()) {
            continue;
        }
        count--;
        System.out.println("Продан 1 товар, всего " + count);
        lock.unlock();
        producerSemaphore.release();
    }

    public static void main(String[] args) {

        Store store = new Store();
        for (int i = 0; i < 10; i++) {
            new Thread(new Producer(store)).start();
            new Thread(new Consumer(store)).start();
        }
    }
}
