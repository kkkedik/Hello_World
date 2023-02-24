package by.itacademy.hw15.task1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Collection<String> col = Arrays.asList("inte_ger", "Log? in", "log in",
                "login", "pick", "trydaf faawfw", "catch", "integedaw");

        boolean match = col.stream().anyMatch(Predicate.isEqual("login"));
        System.out.println(match);
        System.out.println();

        System.out.println(col.stream().min(((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return -1;
            }
            if (o1.length() == o2.length()) {
                return 0;
            } else
                return 1;

        })).get());

        System.out.println(col.stream().max(((o1, o2) -> {
            if (o1.length() < o2.length()) {
                return 1;
            }
            if (o1.length() == o2.length()) {
                return 0;
            } else
                return -1;

        })).get());

        System.out.println();

        col.stream().filter(s -> s.matches("\\w*[a-zA-z]*")).forEach(System.out::println);


        System.out.println();
        col.stream().flatMap(o1 -> {
            return Arrays.stream(o1.split(" "));
        }).forEach(System.out::println);
    }
}
