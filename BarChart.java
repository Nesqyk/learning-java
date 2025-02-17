/*
 * Programmer: Tabornal, Tyrone M.
 * Description: This program takes basketball scores for five players as 
 * input and displays a simple bar chart of asterisks representing each player's score.
 * Activity: No. 4 : BarChart
 */

import java.util.Scanner;

public class BarChart {
    
    public static void main(String[] args) 
    {
        // Initialize Scanner for user input.
        Scanner scanner = new Scanner(System.in);

        // Input scores for each player individually.
        System.out.print("Enter points scored by Art>> ");
        int PlayerArtScore = scanner.nextInt();

        System.out.print("Enter points scored by Bob>> ");
        int PlayerBobScore = scanner.nextInt();

        System.out.print("Enter points scored by Cal>> ");
        int PlayerCalScore = scanner.nextInt();

        System.out.print("Enter points scored by Dan>> ");
        int PlayerDanScore = scanner.nextInt();

        System.out.print("Enter points scored by Eli>> ");
        int PlayerEliScore = scanner.nextInt();


        // Print header for game points display.
        System.out.println("\nPoints for game:\n");

        // Display score for Art as asterisks.
        System.out.print("Art ");
        for(int i = 0; i < PlayerArtScore; i++)
        {
            System.out.print("*");
        }
        System.out.println(); // New line after Art's score.

        // Display score for Bob as asterisks.
        System.out.print("Bob ");
        for(int i = 0; i < PlayerBobScore; i++)
        {
            System.out.print("*");
        }
        System.out.println(); // New line after Bob's score.

        // Display score for Cal as asterisks.
        System.out.print("Cal ");
        for(int i = 0; i < PlayerCalScore; i++)
        {
            System.out.print("*");
        }
        System.out.println(); // New line after Cal's score.

        // Display score for Dan as asterisks.
        System.out.print("Dan ");
        for(int i = 0; i < PlayerDanScore; i++)
        {
            System.out.print("*");
        }
        System.out.println(); // New line after Dan's score.

        // Display score for Eli as asterisks.
        System.out.print("Eli ");
        for(int i = 0; i < PlayerEliScore; i++)
        {
            System.out.print("*");
        }
        System.out.println(); // New line after Eli's score.

        // Close the scanner to prevent resource leaks.
        scanner.close();
    }
}
