package by.itacademy.hw4;

public class Task7 {
    public static void main(String[] args) {
        int array[] = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        printArray(array);

        for (int i = 0, p = array.length - 1; i < array.length / 2 ; i++, p--) {
            int t = array[p];
            array[p] = array[i];
            array[i] = t;
        }
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
