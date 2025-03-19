import javax.swing.JOptionPane;

public class LateCalculator {
    


    
    /**
     *  prompt chronological order:
     *  name, days the book is overdue (must be postive), late fee
     * Displat the f.f:
     * borrower's name, total fine.
     * ask again if they want to calculate util they choose to exit.
     */

    public static void main(String[] args) {

        String nameInput = JOptionPane.showInputDialog("Enter your name"); 

        do 
        {
            String daysInput = JOptionPane.showInputDialog("Enter the day(s) the book is overdue"); 
            int parsedDays = Integer.parseInt(daysInput);

            if(parsedDays < 1) 
            {
                JOptionPane.showMessageDialog(null, "The numbet of days must not be less than 1", "Invalid Input Days", JOptionPane.WARNING_MESSAGE);
                continue;
            }
        
            int dailyFee = 0;
        
            if(parsedDays >= 1 && parsedDays <= 5) 
            {
                dailyFee = 5;
            } else if(parsedDays >= 6 && parsedDays <= 10) 
            {
                dailyFee = 7;
            } else 
            {
                dailyFee = 10;
            }

            int lateFine = parsedDays * dailyFee;

            String messaegeOutput = "Borrower's Name : "  + nameInput + 
            "\nTotal Fine : "  + lateFine;

            JOptionPane.showMessageDialog(null, messaegeOutput, "Fee Details", JOptionPane.INFORMATION_MESSAGE);

            String confirmation = JOptionPane.showInputDialog("Do you want to calculate again?\nPlease enter either Y (Yes) or N (No) to proceed");

            char confirmationChar = confirmation.charAt(0);

            if(confirmationChar == 'Y' || confirmationChar == 'y') 
            {
                continue;
            } else 
            {
                break;
            }
        } while(true);    
    }


    
}
