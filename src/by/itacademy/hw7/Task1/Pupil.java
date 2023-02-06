package by.itacademy.hw7.Task1;

public abstract class Pupil {
    protected String name;
    protected String surname;
    protected int courseNum;
    protected String groupName;
    protected double averageRating;
    final int scholarshipAmount;

    public Pupil(String name, String surname, int courseNum,
                 String groupName, double averageRating) {
        this.name = name;
        this.surname = surname;
        this.courseNum = courseNum;
        this.groupName = groupName;
        this.averageRating = averageRating;
        if (averageRating < 5) {
            scholarshipAmount = 80;
        } else {
            scholarshipAmount = 100;
        }
    }

    public String getInfo() {
        return String.format("Name: %s\nSurname: %s\nCourse number: %d\n" +
                        "Group name: %s\nAverage rating: %f\nScholarshipAmount: %d",
                name, surname, courseNum, groupName, averageRating, scholarshipAmount);
    }
}
