interface Course {
    void enrollStudent(String studentName);
    void dropStudent(String studentName);
    String getCourseDetails();
}

class ProgrammingCourse implements Course {
    private String courseDetails = "Programming Course: Learn Java, Python, C++.";

    @Override
    public void enrollStudent(String studentName) {
        System.out.println(studentName + " enrolled in Programming Course.");
    }

    @Override
    public void dropStudent(String studentName) {
        System.out.println(studentName + " dropped from Programming Course.");
    }

    @Override
    public String getCourseDetails() {
        return courseDetails;
    }
}

class MathCourse implements Course {
    private String courseDetails = "Math Course: Learn Algebra, Calculus, Geometry.";

    @Override
    public void enrollStudent(String studentName) {
        System.out.println(studentName + " enrolled in Math Course.");
    }

    @Override
    public void dropStudent(String studentName) {
        System.out.println(studentName + " dropped from Math Course.");
    }

    @Override
    public String getCourseDetails() {
        return courseDetails;
    }
}

public class EducationalCourseManagementSystem {
    public static void main(String[] args) {
        Course programming = new ProgrammingCourse();
        programming.enrollStudent("John Doe");
        System.out.println(programming.getCourseDetails());
        programming.dropStudent("John Doe");

        Course math = new MathCourse();
        math.enrollStudent("Jane Doe");
        System.out.println(math.getCourseDetails());
        math.dropStudent("Jane Doe");
    }
}
