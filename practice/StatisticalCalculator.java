package practice;

import java.util.Scanner;

public class StatisticalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get number of students
        System.out.print("Enter the number of students in your class: ");
        int numStudents = scanner.nextInt();
        
        // Create an array to store test scores
        int[] scores = new int[numStudents];
        
        // Input test scores
        System.out.println("Enter the test scores of each student, one by one:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        
        // Display menu and process user choice
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Mean: " + calculateMean(scores));
                    break;
                case 2:
                    System.out.println("Median: " + calculateMedian(scores));
                    break;
                case 3:
                    int[] modeResult = calculateMode(scores);
                    displayMode(modeResult);
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            
            if (!exit) {
                System.out.println("Press Enter to continue...");
                scanner.nextLine(); // Consume the newline
                scanner.nextLine(); // Wait for user input
            }
        }
        
        scanner.close();
    }
    
    // Display menu options
    public static void displayMenu() {
        System.out.println("\n----- STATISTICAL CALCULATOR -----");
        System.out.println("Option 1: Calculate the Mean (Average) of the test scores.");
        System.out.println("Option 2: Calculate the Median of the test scores.");
        System.out.println("Option 3: Calculate the Mode of the test scores.");
        System.out.println("Option 0: Exit the program.");
        System.out.print("Enter your choice: ");
    }
    
    // Calculate mean
    public static double calculateMean(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return (double) sum / scores.length;
    }
    
    // Sort the array using bubble sort
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Calculate median
    public static double calculateMedian(int[] scores) {
        // Create a copy of the array to avoid modifying the original
        int[] sortedScores = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            sortedScores[i] = scores[i];
        }
        
        // Sort the copy
        sortArray(sortedScores);
        
        if (sortedScores.length % 2 == 1) {
            // Odd number of students
            return sortedScores[sortedScores.length / 2];
        } else {
            // Even number of students
            int middle1 = sortedScores[(sortedScores.length / 2) - 1];
            int middle2 = sortedScores[sortedScores.length / 2];
            return (middle1 + middle2) / 2.0;
        }
    }
    
    // Calculate mode
    public static int[] calculateMode(int[] scores) {
        // Find the maximum score to determine the size of frequency array
        int maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        
        // Create frequency array (index = score, value = frequency)
        int[] frequency = new int[maxScore + 1];
        for (int i = 0; i < scores.length; i++) {
            frequency[scores[i]]++;
        }
        
        // Find the highest frequency
        int maxFrequency = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
            }
        }
        
        // Count how many scores have the highest frequency
        int modeCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == maxFrequency) {
                modeCount++;
            }
        }
        
        // If max frequency is 1, there is no mode
        if (maxFrequency == 1) {
            return new int[]{-1, 0}; // Special indicator for no mode
        }
        
        // Create array to hold the modes and their frequency
        int[] modes = new int[modeCount + 1]; // +1 to store frequency at the end
        
        // Fill the modes array
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == maxFrequency) {
                modes[index++] = i;
            }
        }
        
        // Store the frequency as the last element
        modes[modeCount] = maxFrequency;
        
        return modes;
    }
    
    // Display mode results
    public static void displayMode(int[] modeResult) {
        if (modeResult[0] == -1) {
            System.out.println("Mode: No mode (all scores occur exactly once)");
            return;
        }
        
        // The last element contains the frequency
        int frequency = modeResult[modeResult.length - 1];
        
        System.out.print("Mode: ");
        for (int i = 0; i < modeResult.length - 1; i++) {
            System.out.print(modeResult[i]);
            if (i < modeResult.length - 2) {
                System.out.print(", ");
            }
        }
        System.out.println(" (each occurs " + frequency + " times)");
    }
}
