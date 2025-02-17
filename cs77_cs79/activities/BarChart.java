package cs77_cs79.activities;

/*
 * Programmer: Tabornal, Tyrone M.
 * Description: This program takes basketball scores for five players as 
 * input and displays a simple bar chart of asterisks representing each player's score.
 * Activity: No. 4
 */

import java.util.Scanner;

public class BarChart {
    

    public static void main(String[] args) {
        // Array for player scores (size 5).
        int[] scores = new int[5];

        // Player names array initialization.
        String[] teamNames = {"Art" , "Bob", "Cal", "Dan", "Eli"};

        // Initialize input Scanner.
        Scanner s = new Scanner(System.in);

        // Loop to get scores for each player.
        for(int i = 0 ; i < scores.length; i ++)
        {
            // Prompt user for player score.
            System.out.printf("Enter points scored by " + teamNames[i] + " >> ");
            // Read player's score from input.
            scores[i] = s.nextInt();
        }

        // Display game points header.
        System.out.printf("\nPoints for Game\n\n");

        // Loop to display scores as asterisks.
        for(int index = 0; index < scores.length; index++)
        {
            // Print player name.
            System.out.printf("%s ", teamNames[index]);
            // Print asterisks representing the score.
            for(int j = 0; j < scores[index]; j++) {
                System.out.printf("*");
            }
            // New line after each player's score.
            System.out.println();
        }
        // Close input Scanner.
        s.close();
    }
}
