public class MVCPatternTest {

    public static void main(String[] args) {

        // Create Model
        Student student =
                new Student("Dinesh Babu", "101", "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller =
                new StudentController(student, view);

        // Display initial details
        System.out.println("Initial Student Details:");
        controller.updateView();

        // Update student details
        controller.setStudentName("Dinesh Kumar");
        controller.setStudentGrade("A+");

        // Display updated details
        System.out.println("\nUpdated Student Details:");
        controller.updateView();
    }
}