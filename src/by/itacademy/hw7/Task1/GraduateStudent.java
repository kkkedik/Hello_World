package by.itacademy.hw7.Task1;

public class GraduateStudent extends Pupil {
    final String scientificWork;

    public GraduateStudent(String name, String surname, int courseNum,
                           String groupName, double averageRating, String scientificWork) {
        super(name, surname, courseNum, groupName, averageRating);
        this.scientificWork = scientificWork;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nScientificWork: " + scientificWork;
    }
}
