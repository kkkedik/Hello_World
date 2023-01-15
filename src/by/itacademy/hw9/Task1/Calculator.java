package by.itacademy.hw9.Task1;

public class Calculator {

    public static <T extends Number> double sum(T el1, T el2) {
        return el1.doubleValue() + el2.doubleValue();
    }

    public static <T extends Number> double multiply(T el1, T el2) {
        return el1.doubleValue() * el2.doubleValue();
    }

    public static <T extends Number> double divide(T el1, T el2) {
        return el1.doubleValue() / el2.doubleValue();
    }

    public static <T extends Number> double subtraction(T el1, T el2) {
        return el1.doubleValue() - el2.doubleValue();
    }
}
