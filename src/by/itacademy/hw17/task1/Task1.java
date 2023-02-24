package by.itacademy.hw17.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Class clas = HashMap.class;
        Field[] fields = clas.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
        System.out.println();

        Constructor[] constructors = clas.getConstructors();
        for (int i = 0; i < fields.length; i++) {
            try {
                System.out.println(constructors[i]);
            } catch (ArrayIndexOutOfBoundsException exception) {
            }
        }
        System.out.println();

        clas.getMethods();
        Method[] methods = HashMap.class.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
        System.out.println();
        Class[] classes = clas.getClasses();
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
    }
}

