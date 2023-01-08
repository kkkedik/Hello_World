package by.itacademy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String str = "Versions: Java 5, Java 6, Java 7, Java 8, Java 12.";
        //String strF = "Java";
        //Matcher matcher = Pattern.compile("\\d.+\\dJava (\\d+)").matcher(str);
        //int index = str.indexOf(strF);

        Matcher matcher = Pattern.compile("Java\\s\\d+").matcher(str);
        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
