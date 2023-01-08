package by.itacademy.hw6;

public class Task4 {
    public static void main(String[] args) {
        int a = 5000;
        int b = 30000;
        String str = "     ";
        StringBuilder try1 = new StringBuilder();
        System.out.println(try1.append(a).append(str).append("+").append(str).append(b)
                .append(str).append("=")
                .append(str).append(a + b));
        int t = try1.lastIndexOf("=");
        System.out.println(try1.replace(t, t + 1, "равно"));
        StringBuilder try2 = new StringBuilder();
        System.out.println(try2.append(a).append(str).append("-").append(str).append(b)
                .append(str).append("=")
                .append(str).append(a - b));
        t = try2.lastIndexOf("=");
        System.out.println(try2.replace(t, t + 1, "равно"));
        StringBuilder try3 = new StringBuilder();
        System.out.println(try3.append(a).append(" * ").append(b).append(" = ").append(a * b));
        t = try3.lastIndexOf("=");
        System.out.println(try3.replace(t, t + 1, "равно"));
    }
}
