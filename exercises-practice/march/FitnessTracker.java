package course.activities.march;
/**
 * Programmer: Tabornal, Tyrone M.
 * Description: A program that checks whether if a participant qualifies for a fitness badge if they meet the requirments.
 * Activity: 17
 */

import java.util.Scanner;

public class FitnessTracker {

    private int totalSteps;
    private String name;

    // FitnessTracker Constructor
    public FitnessTracker(String name, int totalSteps) {
        this.name = name;
        this.totalSteps = totalSteps;
    }


    // Method that checks if a participant is qualified for a badge.
    void qualifiesForBadge() {
        if(totalSteps >= 70000) {
            System.out.println("\nCongratulations! " + this.name + ", you qualify for the special achievement badge." + "\n\nTotal Steps for the Week: " + totalSteps);
        } else {
            System.out.println("\nUnfortunanely " + this.name + ", you are not qualified for the badge. Keep up the good work!" + "\n\nTotal Steps for the Week: " + totalSteps);
        }
    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter participant's name: ");
        String name = s.nextLine();
        final int weekDays = 7;

        int totalSteps = 0;

        // Prompts user for participant's steps for a specific day.
        for(int i = 0; i < weekDays; i ++) {
            System.out.print("Please enter steps for Day " + (i + 1) + ": ");
            totalSteps += s.nextInt();
        }

        // FitnessTracker Object for participantOne
        FitnessTracker participantOne = new FitnessTracker(name, totalSteps);

        // Displays qualification
        participantOne.qualifiesForBadge();

        s.close();
    }
}
