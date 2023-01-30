package by.itacademy.hw12.task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws Exception {
        try {
            newFile(1000, "in1.txt");
            newFile(1000, "in2.txt");
            FileWriter out = new FileWriter("out.txt");

            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(readNumbers("in1.txt"));
            list.addAll(readNumbers("in2.txt"));
            Collections.sort(list);

            for (int i = 0; i < list.size(); i++) {
                out.write(list.get(i) + "\n");
            }
            out.flush();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> readNumbers(String name) throws Exception {
        FileReader fr1 = new FileReader(name);
        Scanner scanner1 = new Scanner(fr1);
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner1.hasNextInt()) {
            list.add(scanner1.nextInt());
        }
        fr1.close();
        return list;
    }

    public static void newFile(int k1, String name) throws Exception {
        FileWriter in1 = new FileWriter(name);

        for (int i = 1; i <= k1; i++) {
            in1.write((int) (Math.random() * (100001 + 1)) - 1 + "\n");
        }

        in1.close();
    }

}
