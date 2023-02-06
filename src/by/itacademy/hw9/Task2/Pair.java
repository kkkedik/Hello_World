package by.itacademy.hw9.Task2;

public class Pair<T> {

    private T value1;
    private T value2;

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }

    public void swapValue() {
        T value = value1;
        value1 = value2;
        value2 = value;
    }

    public void setFirstValue(T value) {
        this.value1 = value;
    }

    public void setSecValue(T value) {
        this.value2 = value;
    }

    public void printValues() {
        System.out.println("Первое значение: " + value1);
        System.out.println("Второе значение: " + value2);
    }

    public Pair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

//    public Pair() {
//
//    }

    //    public static <T> Pair createAndAdd2Values(T o1, T o2) {
//        Pair<T> result = new Pair<>();
//        result.value1 = o1;
//        result.value2 = o2;
//        return result;
//    }


}
