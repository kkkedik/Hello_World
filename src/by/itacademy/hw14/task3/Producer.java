package by.itacademy.hw14.task3;

public class Producer implements Runnable {

    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.produce();
    }
}
