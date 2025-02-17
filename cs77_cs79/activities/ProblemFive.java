package cs77_cs79.activities;
/*
 * Programmer: Tabornal, Tyrone M.
 * Description: Displays the input letter and its corresponding digit in a message dialog.
 * Activity: No. 5
 */


import javax.swing.JOptionPane;

public class ProblemFive {

    public static void main(String[] args) {

        // Infinite loop.
        do {
            // Get letter input from user.
            String messageInput = JOptionPane.showInputDialog("Program to convert uppercase letters to their corresponding telephone digits.\nTo stop the program enter #.\nEntrer a letter");
            // Get first char.
            char letter = messageInput.charAt(0);
            // Check for exit condition '#'.
            if(messageInput.equals("#") ) {
                break; // Exit loop on '#'.
            } 
            int digit = 0;

            // Determine telephone digit.
            if (letter >= 'A' && letter <= 'C') digit = 2; // A-C -> 2
            else if (letter >= 'D' && letter <= 'F') digit = 3; // D-F -> 3
            else if (letter >= 'G' && letter <= 'I') digit = 4; // G-I -> 4
            else if (letter >= 'J' && letter <= 'L') digit = 5; // J-L -> 5
            else if (letter >= 'M' && letter <= 'O') digit = 6; // M-O -> 6
            else if (letter >= 'P' && letter <= 'S') digit = 7; // P-S -> 7
            else if (letter >= 'T' && letter <= 'V') digit = 8; // T-V -> 8
            else if (letter >= 'W' && letter <= 'Z') digit = 9; // W-Z -> 9

            // Output message: letter and digit.
            String messageOutput = "The letter your entered is: " + letter +
                    "\n The corresponding telephone digit is : " + digit;
            // Show output dialog.
            JOptionPane.showMessageDialog(null, messageOutput, "Telephone Digit", JOptionPane.PLAIN_MESSAGE);
        } while (true); // Loop indefinitely.
    }
}
