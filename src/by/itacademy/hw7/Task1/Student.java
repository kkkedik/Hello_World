package by.itacademy.hw7.Task1;

public class Student extends Pupil {
    final int scholarshipAmount;

    public Student(String name, String surname, int courseNum,
                   String groupName, double averageRating) {
        super(name, surname, courseNum, groupName, averageRating);
        if (averageRating < 5) {
            scholarshipAmount = 80;
        } else {
            scholarshipAmount = 100;
        }
    }

    public String getInfo() {
        return super.getInfo() + "\nScholarshipAmount: " + scholarshipAmount;
    }
}
