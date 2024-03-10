import java.util.HashMap;
import java.util.Map;

public class StudentCourses extends Student {
    private String semester;
    private Map<String, Integer> courses;

    public StudentCourses(String name, int rollNumber, String semester) {
        super(name, rollNumber);
        this.semester = semester;
        this.courses = new HashMap<>();
    }

    public void addCourse(String courseName, int marks) {
        courses.put(courseName, marks);
    }

    public void displayCourses() {
        super.displayInfo(); // Display student information from the base class
        System.out.println("Semester: " + semester);
        System.out.println("Course Information:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // Create a new student courses object for a specific semester
        StudentCourses studentCourses = new StudentCourses("Manan-J", 186, "4th");

        // Add courses and marks
        studentCourses.addCourse("Mathematics", 90);
        studentCourses.addCourse("Computer Science", 85);
        studentCourses.addCourse("English", 95);

        // Display student information and courses information
        studentCourses.displayCourses();
    }
}


