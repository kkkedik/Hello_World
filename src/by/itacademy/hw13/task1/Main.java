package by.itacademy.hw13.task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getState());
         thread.sleep(100);
        System.out.println(thread.getState());
//        Thread.sleep(500);
//        System.out.println(thread.getState());
    }

}
