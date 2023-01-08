package by.itacademy.hw7.Task1;

public class Pupil {
    protected String name;
    protected String surname;
    protected int courseNum;
    protected String groupName;
    protected double averageRating;

    public Pupil(String name, String surname, int courseNum,
                 String groupName, double averageRating) {
        this.name = name;
        this.surname = surname;
        this.courseNum = courseNum;
        this.groupName = groupName;
        this.averageRating = averageRating;
    }

    public String getInfo() {
        return String.format("Name: %s\nSurname: %s\nCourse number: %d\n" +
                        "Group name: %s\nAverage rating: %f",
                name, surname, courseNum, groupName, averageRating);
    }
}
