import java.util.ArrayList;

public class Student {
    private String fullName;
    private int id;
    private double GPA;
    private ArrayList<Course> courses;

    public Student(String fullName, int id, double GPA) {
        this.fullName = fullName;
        this.id = id;
        this.GPA = GPA;
        this.courses = new ArrayList<>();
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        double totalPoints = 0.0;
        double totalCredits = 0.0;

        for (Course course : courses) {
            totalPoints += course.getCoursePoint() * course.getCredit();
            totalCredits += course.getCredit();
        }

        return (totalCredits == 0) ? 0.0 : totalPoints / totalCredits;
    }

    public void addCourse(Course course) {
        if (courses.contains(course)) {
            System.out.println("The student " + fullName + " is already enrolled in " + course.getName());
        } else {
            courses.add(course);
        }
    }
}
