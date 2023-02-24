package by.itacademy.hw122.task2;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {
    public static void main(String[] args) {
        {
            try (FileWriter writer = new FileWriter("file1.txt", false)) {
                writer.write("Белая берёза\n" +
                        "Под моим окном\n" +
                        "Принакрылась снегом,\n" +
                        "Точно серебром.\n" +
                        "\n" +
                        "На пушистых ветках\n" +
                        "Снежною каймой\n" +
                        "Распустились кисти\n" +
                        "Белой бахромой.");
                FileReader fr = new FileReader("file1.txt");
                Scanner scanner = new Scanner(fr);

                int wordsCount = 0;
                int punctCount = 0;
                writer.close();
                while (scanner.hasNextLine()) {
                    String str = scanner.nextLine();
                    Pattern pattern = Pattern.compile("\\p{Punct}");

                    String[] arrayText = str.split("\\s");
                    for (String s : arrayText) {
                        int count = 0;
                        Matcher matcher = pattern.matcher(s);
                        while (matcher.find()) {
                            ++count;
                        }
                        punctCount += count;
                        if (count != s.length()) {
                            ++wordsCount;
                        }
                    }
                    System.out.println(str);
                }
                System.out.println("количество слов: " + wordsCount);
                System.out.println("колличество знаков прип-ия: " + punctCount);

                fr.close();
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
    }
}
