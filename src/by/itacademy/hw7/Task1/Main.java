package by.itacademy.hw7.Task1;

public class Main {
    public static void main(String[] args) {
        Pupil pupil = new Pupil("Andrey", "Policov",
                3, "PGS_161", 4.5);

        Student Vlad = new Student("Vlad", "Golstov",
                3, "PGS_172", 5.0);
        Student Victor = new Student("Victor", "Narov",
                1, "PGS_191", 3.7);
        Student Ivan = new Student("Ivan", "Budco",
                5, "PGS_151", 2.2);

        Graduate_Student Pavel = new Graduate_Student("Pavel",
                "Golov", 3, "PGS_172",
                4.9, "People in prison");
        Graduate_Student Lola = new Graduate_Student("Lola",
                "Kilco", 2, "PGS_162",
                4.1, "Die");

        Pupil[] array = new Pupil[5];
        array[0] = Pavel;
        array[1] = Vlad;
        array[2] = Victor;
        array[3] = Lola;
        array[4] = Ivan;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getInfo());
        }

    }
}
