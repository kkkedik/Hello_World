package by.itacademy.hw7.Task1;

public class Graduate_Student extends Pupil {
    final int scholarshipAmount;
    final String scientificWork;

    public Graduate_Student(String name, String surname, int courseNum,
                            String groupName, double averageRating, String scientificWork) {
        super(name, surname, courseNum, groupName, averageRating);
        this.scientificWork = scientificWork;
        if (averageRating < 5) {
            scholarshipAmount = 180;
        } else {
            scholarshipAmount = 200;
        }
    }

    // в задании выводить название научной работы не нужно было, по этому не делал
    public String getInfo() {
        return super.getInfo() + "\nScholarshipAmount: " + scholarshipAmount;
        /*return String.format("Name: %s\n Surname: %s\n Course number: %d\n " +
                        "Group name: %s\nAverage rating: %d\nscholarshipAmount: %d\n",
                name, surname, courseNum, groupName, averageRating, scholarshipAmount);*/
    }
}
