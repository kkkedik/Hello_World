package by.itacademy.hw14.task3;

public class Consumer implements Runnable {

    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.buy();
    }
}
