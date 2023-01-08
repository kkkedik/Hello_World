package by.itacademy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String str = new String("\"Object-oriented programming is a programming language model organized" +
                "around objects rather than \"actions\" and data rather than logic. Object-" +
                "oriented programming blabla. Object-oriented programming bla.\"");

        Pattern pattern = Pattern.compile("[Oo]bject-oriented programming");
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find()) {
            if (i % 2 != 0) {
                str = str.substring(0, matcher.start()) + "OOP" + str.substring(matcher.end());
            }
            i++;
        }
        System.out.println(str);
    }
}
