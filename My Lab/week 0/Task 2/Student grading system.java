package task2;
import java.util.Scanner;
public class Task2 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter number of students: ");
 int students = scanner.nextInt();
 scanner.nextLine(); 
 System.out.print("Enter number of subjects per student: ");
 int subjects = scanner.nextInt();
 scanner.nextLine(); 
 String[] names = new String[students];
 int[][] grades = new int[students][subjects];
 for (int i = 0; i < students; i++) {
 System.out.print("Enter name for student:");
 names[i] = scanner.nextLine();
 }
 for (int i = 0; i < students; i++) {
 System.out.println("Enter the grades " + names[i] + ":");
 for (int j = 0; j < subjects; j++) {
 System.out.print("Subject " + (j + 1) + ": ");
 grades[i][j] = scanner.nextInt();
 if (grades[i][j] < 0 || grades[i][j] > 100) {
 System.out.println("Invalid grade");
 j--; 
 }
 }
 scanner.nextLine();
 }
 int[] totalMarks = new int[students];
 double[] averageMarks = new double[students];
 char[] gradesList = new char[students];
 for (int i = 0; i < students; i++) {
 totalMarks[i] = 0;
 for (int j = 0; j < subjects; j++) {
 totalMarks[i] += grades[i][j];
 }
 averageMarks[i] = (double) totalMarks[i] / subjects;
 if (averageMarks[i] >= 80) {
 gradesList[i] = 'A';
 } else if (averageMarks[i] >= 60) {
 gradesList[i] = 'B';
 } else if (averageMarks[i] >= 40) {
 gradesList[i] = 'C';
 } 
else
{
 gradesList[i] = 'F';
 }
 }
 System.out.println("\nStudent Grades:");
 for (int i = 0; i < students; i++) 
 {
 System.out.println("Student: " + studentNames[i]);
 System.out.println("Total Marks: " + totalMarks[i]);
 System.out.println("Average Marks: " + averageMarks[i]);
 System.out.println("Grade: " + gradesList[i]);
 System.out.println();
 }
 scanner.close();
 }
}
}
