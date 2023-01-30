package by.itacademy.hw12.task4;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Task4 {
    public static void main(String[] args) {
        Person[] people = {new Person("Ivan", "Ivanov", 50), new Person("Oleg", "Petrov", 28),
                new Person("Olga", "Kolova", 76), new Person("Lev", "Tolstoi", 19),
                new Person("Vika", "Zuck", 12)};
        try {
            FileOutputStream fos = new FileOutputStream("People");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);
            for (Person person : people) {
                oos.writeObject(person);
            }

            oos.close();

            FileInputStream fis = new FileInputStream("People");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personCount = ois.readInt();
            Person[] people1 = new Person[personCount];

            for (int i = 0; i < personCount; i++) {
                people1[i] = (Person) ois.readObject();
            }

            Arrays.sort(people1, new Comparator<Person>() {
                public int compare(Person first, Person second) {
                    if (first.getSurname() != second.getSurname()) {
                        return first.getSurname().compareTo(second.getSurname());
                    }
                    return first.getName().compareTo(second.getName());
                }
            });
            System.out.println(Arrays.toString(people1));
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
