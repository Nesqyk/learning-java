package cs77_cs79.oop;

/**
 * Programmer: Tabornal, Tyrone M.
 * Description: A program that takes input for 5 students (name, age, 5 grades), calculates averages, and prints the results.
 * Activity: 14
 */

import java.util.Scanner;

public class TestStudentP {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Instantiate Array for Students
        int studentLength = 5;
        StudentP[] students = new StudentP[studentLength];

        // Loop through n times to prompt the value for students
        for(int i = 0 ; i < studentLength; i++)  {
            // Prompt for name for student n
            System.out.print("Enter Student No." + (i + 1) + "'s Name: ");
            String name = s.nextLine();

            // Prompt for age for student n
            System.out.print("Enter Student No." + (i + 1) + "'s Age: ");
            int age = s.nextInt();

            // Instantiate Array for Student's grade
            double[] grades = new double[studentLength];

            for(int j = 0 ; j < grades.length; j++) {
                System.out.print("Enter Student No. " + (i + 1) + "'s Grade No." + (j + 1) + " : ");
                double markGrade = s.nextDouble();
                grades[j] = markGrade;
            }

            // Create Student Object 
            students[i] = new StudentP(name, age, grades);
            s.nextLine();
            System.out.println();
        }

        s.close();

        // Display output
        for(int i = 0 ; i < studentLength; i ++) {
            students[i].displayInformation((i+1));
        }
    }
}
