package by.itacademy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        String str = "00a";
        System.out.println(str.matches("#?[a-fA-F0-9]{3}|#?[a-fA-F0-9]{6}"));

//        Pattern pattern = Pattern.compile("#?[a-fA-F0-9]{3}|#?[a-fA-F0-9]{6}");
//        Matcher matcher = pattern.matcher(str);
//        while (matcher.find()) {
//            System.out.println(str.substring(matcher.start(), matcher.end()));
//        }
    }
}
