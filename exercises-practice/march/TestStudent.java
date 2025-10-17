package course.activities.march;


/**
 * Programmer: Tabornal, Tyrone M.
 * Description: This program implements creating a student object, takes name and age as input, and generates output.
 * Activity: 12
 */

import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Prompt user for student's name
        System.out.print("Please enter the student's name: ");
        String name = s.nextLine();

        // Prompt user for student's age
        System.out.print("Please enter the student's age: ");
        int age = s.nextInt();

        // Instantiate student object
        Student studentOne = new Student(name, age);

        // Print output
        studentOne.printStudentDetails();

        s.close();
    }
    
}
