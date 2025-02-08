import java.util.ArrayList;

public class Room {
    protected int numberOfComputers;
    protected int capacity;
    private static int studentCount = 0;
    private String lightStatus = "OFF";
    private ArrayList<Student> studentsInRoom;

    public Room() {
        studentsInRoom = new ArrayList<>();
    }

    public void enter(Student s) {
        if (studentsInRoom.contains(s)) {
            System.out.println("The student " + s.getFullName() + " has already entered the room.");
        } else {
            if (studentCount >= capacity) {
                System.out.println("Room is full.");
            } else {
                System.out.println("The student " + s.getFullName() + " entered the room.");
                studentsInRoom.add(s);
                studentCount++;
            }
        }
    }

    public void leave(Student s) {
        if (studentsInRoom.remove(s)) {
            System.out.println("The student " + s.getFullName() + " has left the room.");
        } else {
            System.out.println("The student " + s.getFullName() + " is not in the room.");
        }
    }

    public void printStudents() {
        int counter = 1;
        System.out.println("Students in the room:");
        for (Student student : studentsInRoom) {
            System.out.println(counter + " - " + student.getFullName());
            counter++;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfComputers() {
        return numberOfComputers;
    }

    public void setLightStatus(boolean lightOn) {
        this.lightStatus = lightOn ? "ON" : "OFF";
    }

    public String getLightStatus() {
        return lightStatus;
    }
}
