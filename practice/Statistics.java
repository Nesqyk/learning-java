package practice;

import java.util.Scanner;

public class Statistics {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents;
        int option;
        int score;
        int sum = 0;
        
        // For mode calculation
        int modeValue = 0;
        int modeFrequency = 0;
        
        // For median calculation
        int lowestScore = 101;  // Higher than possible max score
        int highestScore = -1;  // Lower than possible min score
        
        // Get the number of students
        System.out.print("Enter the number of students in your class: ");
        numberOfStudents = scanner.nextInt();
        
        // Get test scores
        System.out.println("Enter the test scores for each student:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            score = scanner.nextInt();
            
            // Update sum for mean calculation
            sum += score;
            
            // Update range for median calculation
            if (score < lowestScore) {
                lowestScore = score;
            }
            if (score > highestScore) {
                highestScore = score;
            }
        }
        
        // Display menu for analysis options
        do {
            System.out.println("\n------ Statistical Analysis Menu ------");
            System.out.println("Option 1: Calculate the Mean (Average) of the test scores.");
            System.out.println("Option 2: Calculate the Median of the test scores.");
            System.out.println("Option 3: Calculate the Mode of the test scores.");
            System.out.println("Option 0: Exit the program.");
            System.out.print("Enter your choice (0-3): ");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    // Calculate mean
                    System.out.printf("\nMean: %.2f\n", (float)sum / numberOfStudents);
                    break;
                    
                case 2:
                    // Median requires re-entering scores, as we need to count through sorted values
                    System.out.println("\nFor median calculation, please re-enter all scores:");
                    
                    // Variables to track positions and values for median
                    int countSoFar = 0;
                    int medianPosition1 = (numberOfStudents + 1) / 2;
                    int medianPosition2 = (numberOfStudents + 2) / 2;
                    int median1 = -1, median2 = -1;
                    float median;
                    
                    // Process score by score from lowest to highest possible value
                    for (int currentValue = lowestScore; currentValue <= highestScore; currentValue++) {
                        // Reset frequency for this value
                        int frequency = 0;
                        
                        // Re-enter all scores to count occurrences
                        System.out.println("Re-enter all scores for median calculation:");
                        for (int j = 0; j < numberOfStudents; j++) {
                            System.out.print("Student " + (j + 1) + ": ");
                            score = scanner.nextInt();
                            
                            if (score == currentValue) {
                                frequency++;
                            }
                        }
                        
                        // Update count and check if we've reached median position(s)
                        countSoFar += frequency;
                        
                        if (median1 == -1 && countSoFar >= medianPosition1) {
                            median1 = currentValue;
                        }
                        
                        if (median2 == -1 && countSoFar >= medianPosition2) {
                            median2 = currentValue;
                        }
                        
                        // If we have both values needed for median, we can stop
                        if (median1 != -1 && median2 != -1) {
                            break;
                        }
                    }
                    
                    // Calculate final median based on whether we have odd or even number of students
                    if (numberOfStudents % 2 == 1) {
                        median = median1;
                    } else {
                        median = (median1 + median2) / 2.0f;
                    }
                    
                    System.out.printf("Median: %.2f\n", median);
                    break;
                    
                case 3:
                    // Mode calculation requires re-entering scores to count frequencies
                    System.out.println("\nFor mode calculation, please re-enter all scores:");
                    
                    // Reset mode tracking variables
                    modeValue = 0;
                    modeFrequency = 0;
                    
                    // Check each possible score value (0-100)
                    for (int currentValue = 0; currentValue <= 100; currentValue++) {
                        // Reset frequency counter for this value
                        int frequency = 0;
                        
                        // Count occurrences of current value
                        System.out.println("Re-enter all scores to check frequency of " + currentValue + ":");
                        for (int j = 0; j < numberOfStudents; j++) {
                            System.out.print("Student " + (j + 1) + ": ");
                            score = scanner.nextInt();
                            
                            if (score == currentValue) {
                                frequency++;
                            }
                        }
                        
                        // Update mode if current frequency is higher
                        if (frequency > modeFrequency) {
                            modeFrequency = frequency;
                            modeValue = currentValue;
                        }
                    }
                    
                    System.out.println("Mode: " + modeValue + " (appears " + modeFrequency + " times)");
                    break;
                    
                case 0:
                    System.out.println("\nExiting program. Goodbye!");
                    break;
                    
                default:
                    System.out.println("\nInvalid option. Please try again.");
            }
        } while (option != 0);
        
        scanner.close();
    }
}
