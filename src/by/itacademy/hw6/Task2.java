package by.itacademy.hw6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();

        String maxNum = "";
        String ad;
        Pattern pattern = Pattern.compile("\\d+\\d"); // шаблон
        Matcher matcher = pattern.matcher(s); // сущность, выполняющая поиск по шаблону
        while (matcher.find()) {
            ad = s.substring(matcher.start(), matcher.end());
            if (maxNum.length() < ad.length()) {
                maxNum = ad;
            }
            // для проверки
            System.out.println(ad);
        }
        System.out.println(maxNum);
        //String[] word = s.split(" ");
        //String maxlethWord = "";
        //for (int i = 0; i < word.length; i++) {
        //    if (word[i].length() >= maxlethWord.length()) {
        //        maxlethWord = word[i];
        //    }
        //}
        //System.out.println(maxlethWord);
    }

}
