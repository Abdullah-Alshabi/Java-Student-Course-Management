import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating Students
        Student student1 = new Student("Ali Mosa", 1121456423, 4.2);
        Student student2 = new Student("Majed Ahmad", 1121456434, 3.9);
        Student student3 = new Student("Nawaf Jaber", 1121456445, 3.5);
        Student student4 = new Student("Khaled Bader", 1121456456, 4.0);

        // Creating Courses
        Course course1 = new Course("Object-Oriented Programming", "CS202", 3, "A");
        Course course2 = new Course("Data Structures", "CS301", 4, "B+");
        Course course3 = new Course("Software Engineering", "CS401", 3, "A-");

        // Assigning courses to students
        student1.addCourse(course1);
        student1.addCourse(course2);
        student1.addCourse(course3);

        student2.addCourse(course2);
        student2.addCourse(course3);

        student3.addCourse(course1);
        student3.addCourse(course3);

        student4.addCourse(course1);
        student4.addCourse(course2);

        // Printing student GPA after enrollment
        System.out.println("Student: " + student1.getFullName() + " - GPA: " + student1.getGPA());
        System.out.println("Student: " + student2.getFullName() + " - GPA: " + student2.getGPA());
        System.out.println("Student: " + student3.getFullName() + " - GPA: " + student3.getGPA());
        System.out.println("Student: " + student4.getFullName() + " - GPA: " + student4.getGPA());

        // Creating Room, Classroom, and Laboratory
        Room generalRoom = new Room();
        Classroom room203 = new Classroom();
        Laboratory lab222 = new Laboratory();

        // Adding students to the classroom
        room203.enter(student1);
        room203.enter(student2);
        room203.enter(student3);
        room203.enter(student4);

        // Printing students in room 203
        room203.printStudents();

        // Light control in classroom
        System.out.println("Light status in room 203: " + room203.getLightStatus());
        room203.setLightStatus(true);
        System.out.println("Light status in room 203: " + room203.getLightStatus());

        // Printing number of computers in different rooms
        System.out.println("Number of computers in Classroom 203: " + room203.getNumberOfComputers());
        System.out.println("Number of computers in Lab 222: " + lab222.getNumberOfComputers());

        // Creating Houses
        House house1 = new House("123 Main St", "Riyadh", true);
        Chalet chalet1 = new Chalet("456 Beach Road", "Jeddah", false, "Blue", 5);

        // Printing House details
        System.out.println(house1);
        System.out.println(chalet1);

        // Checking equality of Chalets
        Chalet chalet2 = new Chalet("456 Beach Road", "Jeddah", false, "Blue", 5);
        System.out.println("Are both chalets equal? " + chalet1.equals(chalet2));
    }
}
