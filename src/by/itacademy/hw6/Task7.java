package by.itacademy.hw6;

public class Task7 {
    public static void main(String[] args) {
        //1
        Double double1 = Double.valueOf("12.233");
        Double double2 = Double.valueOf(0.233);

        //2
        String str = "0.213";
        double t2 = Double.parseDouble(str);
        System.out.println("Value " + t2);
        //3
        Double a1 = 100.10;
        Byte b = a1.byteValue();
        Short s = a1.shortValue();
        Integer i = a1.intValue();
        Long l = a1.longValue();
        Float f = a1.floatValue();
        System.out.println(a1 + " " + b + " " + s + " " + i + " " + l + " " + f);
        //4
        System.out.println(double1);
        System.out.println(double2);
        //5
        String str2 = Double.toString(8.12);
        System.out.println(str2);
    }
}
