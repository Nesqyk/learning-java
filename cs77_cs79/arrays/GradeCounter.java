package cs77_cs79.arrays;

/**
 * Programmer: Tabornal, Tyrone M.
 * Description: This program categorizes 20 entered scores.
 * Activity: Activity in Array 1.
 */

import java.util.Scanner;

public class GradeCounter {
    

    public static void main(String[] args) {    
        int excellent = 0, good = 0, average = 0, poor = 0; // Initialize counters
        int[] grades = new int[20]; // Array to store grades
        Scanner s = new Scanner(System.in); // Scanner for input
    
        for (int i = 0; i < 20; i++) { // Loop through 20 students
            System.out.print("Enter score (0-100) for Student " + (i + 1) + ": ");
            grades[i] = s.nextInt(); // Read grade
    
            if (grades[i] < 0 || grades[i] > 100) { // Validate input
                System.out.print("Please enter a valid number for Student " + (i + 1) + ": ");
                i--; // Decrement i to re-enter the grade for the current student
                continue; // Go to the next iteration of the loop
            }
    
            if (grades[i] >= 76) excellent++; // Classify and count
            else if (grades[i] >= 51) good++;
            else if (grades[i] >= 26) average++;
            else poor++;
        }
    
        s.close(); // Close scanner
        System.out.println(
            "\nGroup\t\tRange\t\tStudent Count" +
            "\nExcellent\t76-100\t\t" + excellent + 
            "\nGood\t\t51-75\t\t" + good + 
            "\nAverage\t\t26-50\t\t" + average +
            "\nPoor\t\t0-25\t\t" + poor); // Print results
    }
}
