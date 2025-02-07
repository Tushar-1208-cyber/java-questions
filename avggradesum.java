// Write a Java program to find the average of the student’s grades knowing that the
// number of students and the number of student courses shall be given by the user. Note: The
// Number of students should be more than zero, and the student grades should be between 0
// – 100. Assign letter grades for the student average based on the distribution below:
// A: 90 – 100
// B: 80 – 89
// C: 70 – 79
// D: 60 – 69
// F: 0 – 59
// Count and print the number of the students who got an A grade.

import java.util.Scanner;

public class avggradesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudents = sc.nextInt();
        if(numStudents <= 0)
        {
            System.out.println("Number of students shouble be greater than 0");
        }

        System.out.println("Enter the number of Courses: ");
        int numCourses = sc.nextInt();
        if(numCourses <= 0)
        {
            System.out.println("Number of courses shouble be greater than 0");
        }

        
    }
}
