package com.mycompany.hello;
import java.util.*;

// Define a Student class implementing Comparable interface
class Student implements Comparable<Student> {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student other) {
        // Compare based on grade, if grades are equal, compare by name
        if (this.grade != other.grade) {
            return Integer.compare(this.grade, other.grade);
        } else {
            return this.name.compareTo(other.name);
        }
    }

    @Override
    public String toString() {
        return name + " (Grade: " + grade + ")";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 85));
        students.add(new Student("David", 75));

        // Sort students
        Collections.sort(students);

        // Print sorted students
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
