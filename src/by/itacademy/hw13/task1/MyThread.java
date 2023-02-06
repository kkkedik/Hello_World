package by.itacademy.hw13.task1;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Выполнение потока");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
