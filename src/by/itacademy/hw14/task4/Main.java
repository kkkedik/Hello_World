package by.itacademy.hw14.task4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor;
        executor = Executors.newFixedThreadPool(3);

        List<Future<String>> futures = new ArrayList<>();

        Callable<String> callable = new CallableClass();

        for (int i = 0; i < 10; i++) {
            Future<String> future = executor.submit(callable);
            futures.add(future);
        }

        for (Future<String> future : futures) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException exception) {
                System.out.println(exception.getMessage());
            }
        }

        executor.shutdown();
    }

    static class CallableClass implements Callable<String> {
        @Override
        public String call() throws Exception {
            Random random = new Random();
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(10);
                sum += number;
            }
            Thread.sleep(1000 + (int) Math.random() * 10000);
            return String.valueOf(sum);
        }
    }
}
