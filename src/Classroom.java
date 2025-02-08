import java.util.ArrayList;

public class Classroom extends Room {
    private ArrayList<Student> studentsInClass;

    public Classroom() {
        studentsInClass = new ArrayList<>();
        setCapacity();
        setNumberOfComputers();
    }

    private void setCapacity() {
        capacity = 50;
    }

    private void setNumberOfComputers() {
        numberOfComputers = 1;
    }
}
