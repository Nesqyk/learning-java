package course.activities;
/* 
 * Activity: 2
 * Description: A program that rounds decimals to its nearest place, and outputs the following:
 * sum of integers, and its average.
 * Author: Tabornal, Tyrone M.
 */

import javax.swing.JOptionPane;

public class ProblemTwo {

    public static void main(String[] args) {

        // Input dialogs for five decimal values
        String firstDecimalStr = JOptionPane.showInputDialog("Please Enter Five Decimals: ");
        String secondDecimalStr = JOptionPane.showInputDialog("Please Enter Five Decimals: ");
        String thirdDecimalStr = JOptionPane.showInputDialog("Please Enter Five Decimals: ");
        String fourthDecimalStr = JOptionPane.showInputDialog("Please Enter Five Decimals: ");
        String fifthDecimalStr = JOptionPane.showInputDialog("Please Enter Five Decimals: ");

        // Convert input strings to double values
        double firstDecimal = Double.parseDouble(firstDecimalStr);
        double secondDecimal = Double.parseDouble(secondDecimalStr);
        double thirdDecimal = Double.parseDouble(thirdDecimalStr);
        double fourthDecimal = Double.parseDouble(fourthDecimalStr);
        double fifthDecimal = Double.parseDouble(fifthDecimalStr);

        // Round each decimal to the nearest integer by adding 0.5 and casting to int
        int firstRounded = (int) (firstDecimal + 0.5);
        int secondRounded = (int) (secondDecimal + 0.5);
        int thirdRounded = (int) (thirdDecimal + 0.5);
        int fourthRounded = (int) (fourthDecimal + 0.5);
        int fifthRounded = (int) (fifthDecimal + 0.5);

        // Sum of rounded integers
        int sumInt = firstRounded + secondRounded + thirdRounded + fourthRounded + fifthRounded;

        // Average of rounded integers
        double averageInt = sumInt / 5.0;

        // Format output for rounded integers
        String intOutput = firstRounded + " " + secondRounded + " " + thirdRounded + " " + fourthRounded + " " + fifthRounded;

        // Final output message
        String finalOutput = "Sum of Integers: " + sumInt + "\nAverage of Integers: " + averageInt;

        // Display the rounded integers
        JOptionPane.showMessageDialog(null, intOutput, "You entered the following integers: ", JOptionPane.INFORMATION_MESSAGE);

        // Display the sum and average of the rounded integers
        JOptionPane.showMessageDialog(null, finalOutput, "Average Score", JOptionPane.INFORMATION_MESSAGE);
    }
}