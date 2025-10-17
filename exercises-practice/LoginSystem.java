package course.practice;
/**
 * Programmer: Tabornal, Tyrone M.
 * Quiz: 4
 * Description: Simple login system that compares usernames and passwords, showing results using dialog boxes.
 */

import javax.swing.JOptionPane;

public class LoginSystem {

    public static void main(String[] args) {

        // Flag to keep the system running until user chooses to exit
        boolean isRunning = true;

        while (isRunning) {

            int choice = Integer.parseInt(promptForChoice());

            switch (choice) {
                case 1:
                    String firstUsername = promptForInput("username", false);
                    String secondUsername = promptForInput("username", true);

                    boolean isUsernameEqual = compareUsernames(firstUsername, secondUsername);

                    displayComparisonResult(isUsernameEqual, "Username", firstUsername, secondUsername);
                    break;
                case 2:
                    String firstPassword = promptForInput("password", false);
                    String secondPassword = promptForInput("password", true);

                    boolean isPasswordEqual = comparePasswords(firstPassword, secondPassword);
                    displayComparisonResult(isPasswordEqual, "Password", firstPassword, secondPassword);
                    break;
                case 3:
                    isRunning = false; // End the loop if user chooses to exit
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Please enter a valid choice");
                    break;
            }
        }
    }

    // Prompt user to choose a program option
    static String promptForChoice() {
        return JOptionPane.showInputDialog(
                "1. Sarah's Program - Compare Usernames\n" +
                "2. John's Program - Compare Passwords\n" +
                "3. Exit");
    }

    // Prompt user to enter or confirm input (username/password)
    static String promptForInput(String inputType, boolean isConfirmation) {
        String message = isConfirmation ? "Please confirm your " + inputType : "Please enter your " + inputType;
        return JOptionPane.showInputDialog(message);
    }

    // Compare two usernames (case-sensitive)
    static boolean compareUsernames(String username1, String username2) {
        return username1.equals(username2);
    }

    // Compare two passwords (case-insensitive)
    static boolean comparePasswords(String password1, String password2) {
        return password1.equalsIgnoreCase(password2);
    }

    // Display the comparison result in a message dialog
    static void displayComparisonResult(boolean areEqual, String inputType, String firstInput, String secondInput) {
        String comparisonResult = areEqual ? "is equal to" : "is not equal to";
        JOptionPane.showMessageDialog(
                null,
                firstInput + " " + comparisonResult + " " + secondInput,
                "Comparison Result - " + inputType,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
