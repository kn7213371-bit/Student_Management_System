import java.util.ArrayList;

public class Admin {
    private ArrayList<Student> students=new ArrayList<Student>();
    private ArrayList<Course> courses=new ArrayList<Course>();

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student,int studentId){
        for(Student s:students){// بمنع تكرار ID الطالب
            if(s.getId()==studentId){
                System.out.println("===== Error: StudentID Already exists! =====");
                return;
            }
        }
        students.add(student);
        System.out.println("Student added successfully!");
    }
    public void removeStudent(int id){
        for(Student student:students){
        if(student.getId()==id){
            students.remove(student);
            System.out.println("Student removed successfully!");
            return;
        }
    }
        System.out.println("Student NOT found!");
    }

    public void viewAllStudents(){
        if (students.isEmpty()){ // === method is empty -> true is empty // false isn't empty......
            System.out.println("No Student Found!");
        }else{
            System.out.println("id"+"\tName"+"\tGrade");
           for(Student s:students)
           {
               s.displayInfo();
           }
        }
    }
    public void addCourse(int studentId, Course course) {
        // تأكد إن الطالب موجود ولا لا
        Student found = null;
        for (Student s : students) {
            if (s.getId() == studentId) {
                found = s;
                break;
            }
        }
        // من بعد متاكدت اني found موجود فيها اني طالب دا ليها id و هيظهر كورس
        if (found != null) {
            courses.add(course);
            System.out.println("Course added successfully for Student ID: " + studentId);
        } else {
            System.out.println("Student with ID " + studentId + " not found. Cannot add course.\n");
        }
    }

    public void viewAllCourses(){
        if(courses.isEmpty()){
            System.out.println("NO course Found!");
        }else{
        for(Course c:courses){
            c.displayCourseInfo();
        }
        }
    }

}

