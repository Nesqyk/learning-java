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
            String messageInput = JOptionPane.showInputDialog("Program to convert uppercase letters to their corresponding telephone digits.\nTo stop the program enter #.\nEnter a letter:");
            // Get first char.
            char letter = messageInput.charAt(0);
            // Check for exit condition '#'.
            if(messageInput.equals("#") ) {
                break; // Exit loop on '#'.
            } 
            int digit = 0;

            // Determine telephone digit.
            switch(letter) 
            {
                case 'A','B', 'C': digit = 2; break; // A-C -> 2
                case 'D','E', 'F': digit = 3; break; // D-F -> 3
                case 'G','H', 'I': digit = 4; break; // G-I -> 4
                case 'J','K', 'L': digit = 5; break; // J-L -> 5 
                case 'M','N', 'O': digit = 6; break; // M-O -> 6
                case 'P','Q', 'R', 'S': digit = 7; break; // P-S -> 7
                case 'T', 'U', 'V': digit = 8; break; // T-V -> 8
                case 'W', 'X', 'Y', 'Z': digit = 9; break; // W-Z -> 9 
            }
            
            // Output message: letter and digit.
            String messageOutput = "The letter you entered is: " + letter +
                    "\n The corresponding telephone digit is: " + digit;
            // Show output dialog.
            JOptionPane.showMessageDialog(null, messageOutput, "Telephone Digit", JOptionPane.PLAIN_MESSAGE);
        } while (true); // Loop indefinitely.
    }
}
