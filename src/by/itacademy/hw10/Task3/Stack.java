package by.itacademy.hw10.Task3;

import java.util.ArrayList;
import java.util.List;

public class Stack<T extends Number> {
    private List<T> list = new ArrayList<>();


    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        if (list.size() == 0) return null;
        return list.remove(list.size() - 1);
    }

    public T max() {
       return list.stream().max(new NumberComparator()).orElse(null);
    }


}
