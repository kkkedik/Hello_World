package by.itacademy.hw12.task3;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        try {
            FileOutputStream ous = new FileOutputStream("file");

            int sum = 0;
            int average;
            byte[] data = new byte[30];
            for (int i = 0; i < 30; i++) {
                data[i] = (byte) ((byte) 1 + Math.random() * 100);
                sum += data[i];
            }
            average = sum / 30;
            ous.write(data);
            ous.close();
            FileInputStream fin = new FileInputStream("file");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print(i + " ");
            }
            System.out.println("Среднее значение равно: " + average);
            fin.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
