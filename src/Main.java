import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        int choice;
        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Course");
            System.out.println("4. View Courses");
            System.out.println("5. Record Grade");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    Student student = new Student(id, name);
                    admin.addStudent(student,id);
                    break;
                case 2:
                    admin.viewAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Course Code: ");
                    String coursecode = scanner.nextLine();
                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();
                    Course course = new Course(coursecode, courseName);
                    System.out.println("Enter StudentId :");
                    int ID=scanner.nextInt();
                    admin.addCourse(ID,course);
                    break;
                case 4:
                    admin.viewAllCourses();
                    break;
                case 5:
                    System.out.print("Enter Student ID to record grade: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();
                    boolean found = false;
                    for (Student s : admin.getStudents()) {
                        if (s.getId() == studentId) {
                            s.setGrade(grade);
                            System.out.println("Grade recorded successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
        scanner.close();
    }
}