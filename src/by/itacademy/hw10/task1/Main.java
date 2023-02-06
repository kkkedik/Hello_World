package by.itacademy.hw10.task1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> firstSet = fillSet();
        Set<Integer> secondSet = fillSet();

        System.out.println("Set num 1: " + firstSet);
        System.out.println("Set num 2: " + secondSet);

        System.out.println("Union set: " + union(firstSet, secondSet));
        System.out.println("Intersect set: " + intersect(firstSet, secondSet));
    }

    public static Set<Integer> fillSet() {
        Set<Integer> set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter num: ");
            int value = scanner.nextInt();
            set.add(value);
        }
        return set;
    }

    private static <T> Set<T> union(Set<T> firstSet, Set<T> secondSet) {
        Set<T> unionSet = new TreeSet<>();
        unionSet.addAll(firstSet);
        unionSet.addAll(secondSet);
        return unionSet;
    }

    private static <T> Set<T> intersect(Set<T> firstSet, Set<T> secondSet) {
        Set<T> intersectSet = new TreeSet<>(firstSet);
        intersectSet.retainAll(secondSet);
        return intersectSet;
    }
}