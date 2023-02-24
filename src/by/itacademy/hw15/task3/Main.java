package by.itacademy.hw15.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3",
                "b1", "b3", "c2", "c1", "c5");
        myList.stream().filter(o1 -> !o1.contains("3")).sorted((o1, o2) -> {
            return o1.substring(1).compareTo(o2.substring(1));
        }).sorted((o1, o2) -> {
            return o1.substring(0, 1).compareTo(o2.substring(0, 1)) * (-1);
        }).map(String::toUpperCase).skip(1).limit(4).forEach(System.out::println);

        List<String> list = myList.stream().filter(o1 -> !o1.contains("3")).sorted((o1, o2) -> {
            return o1.substring(1).compareTo(o2.substring(1));
        }).sorted((o1, o2) -> {
            return o1.substring(0, 1).compareTo(o2.substring(0, 1)) * (-1);
        }).map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(myList.stream().filter(o1 -> !o1.contains("3")).sorted((o1, o2) -> {
            return o1.substring(1).compareTo(o2.substring(1));
        }).sorted((o1, o2) -> {
            return o1.substring(0, 1).compareTo(o2.substring(0, 1)) * (-1);
        }).map(String::toUpperCase).skip(1).limit((list.size()-2)).count());
    }
}
