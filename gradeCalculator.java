import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        int totalSubjects, sum = 0;
        int marks = 0;
        float average;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of Subjects: ");
        totalSubjects = sc.nextInt();

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter the marks of the subject (Out Of 100) " + i + ": ");
            marks = sc.nextInt();
            sum = sum + marks;
        }

        average = sum / totalSubjects;

        System.out.println("Total Marks Obtain: " + sum);
        System.out.println("Average Of Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade Obtain A+");
        } else if (average < 90 && average >= 80) {
            System.out.println("Grade Obtain A");
        } else if (average < 80 && average >= 70) {
            System.out.println("Grade Obtain B");
        } else if (average < 70 && average >= 60) {
            System.out.println("Grade Obtain C");
        } else if (average < 60 && average >= 50) {
            System.out.println("Grade Obtain D");
        } else if (average < 50 && average >= 35) {
            System.out.println("Grade Obtain E");
        } else {
            System.out.println("Grade Obtain F");
        }

    }
}
