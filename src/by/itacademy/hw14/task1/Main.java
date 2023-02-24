package by.itacademy.hw14.task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    public static void main(String[] args) throws InterruptedException {
        Runnable printTime = () -> {
            while (true) {
                System.out.println(LocalDateTime.now().format(formatter));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(printTime);
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(10000);
    }
}
