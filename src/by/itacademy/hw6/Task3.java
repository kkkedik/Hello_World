package by.itacademy.hw6;

public class Task3 {
    public static void main(String[] args) {
        String s = "svd euhfdksjhf kshdksh ksdkfhksf shdfkh ksdfhsk sk31123";
        String[] array = s.split(" ");
        String max = null;
        String min = null;
        int maxIndex = -1;
        int minIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i].length() > max.length()) {
                max = array[i];
                maxIndex = i;
            }
            if (i == 0 || array[i].length() <= min.length()) {
                min = array[i];
                minIndex = i;
            }
        }
        String p = max;
        array[maxIndex] = min;
        array[minIndex] = p;
        System.out.println(String.join(" ", array));
    }
}
