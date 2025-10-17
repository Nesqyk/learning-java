package course.activities;
/* 
 * Activity: 1
 * Description:  A program that calculates the total score percentage of the following:
 * Quizzes, Midterms, Finals.
 * Author: Tabornal, Tyrone M.
 */

import javax.swing.JOptionPane;

public class ProblemOne {


    public static void main(String[] args)
    {
        // Declare the following variables.
        String firstQuiz;
        String secondQuiz;
        String thridQuiz;
        String fourthQuiz;

        String firstMidterm;
        String secondMidterm;

        String finalsStr;

        // Prompt user for each scores.
        firstQuiz = JOptionPane.showInputDialog("Enter the score for the first quiz: ");
        secondQuiz = JOptionPane.showInputDialog("Enter the score for the second quiz: ");
        thridQuiz = JOptionPane.showInputDialog("Enter the score for the third quiz: ");
        fourthQuiz = JOptionPane.showInputDialog("Enter the score for the fourth quiz: ");

        firstMidterm = JOptionPane.showInputDialog("Enter the score for the first midterm: ");
        secondMidterm = JOptionPane.showInputDialog("Enter the score for the second midterm: ");

        finalsStr = JOptionPane.showInputDialog("Enter the score for the final: ");

        // Parse string into integers;
        int firstQuizInt;
        int secondQuizInt;
        int thirdQuizInt;
        int fourthQuizInt;

        firstQuizInt = Integer.parseInt(firstQuiz);
        secondQuizInt = Integer.parseInt(secondQuiz);
        thirdQuizInt = Integer.parseInt(thridQuiz);
        fourthQuizInt = Integer.parseInt(fourthQuiz);
        
        // Calculate the total for the following: quiz, midterm, finals
        int quizTotal;
        int midtermTotal;
        int finalsInt;

        quizTotal = firstQuizInt + secondQuizInt + thirdQuizInt + fourthQuizInt;
        midtermTotal  = Integer.parseInt(firstMidterm) + Integer.parseInt(secondMidterm);

        finalsInt = Integer.parseInt(finalsStr);


        // Calculate percentage
        double average; 
        double quizPercentage;
        double midtermPercentage;
        double finalsPercentage;

        quizPercentage = ( (double) quizTotal / 400 * 0.30) * 100; 
        midtermPercentage =( (double) midtermTotal / 200 * 0.40) * 100;
        finalsPercentage = ( (double) finalsInt / 100 * 0.30) * 100;

        // Calculates average
        average = quizPercentage + midtermPercentage + finalsPercentage;

        String messageOutput;

        messageOutput  = "First Quiz: " + firstQuizInt + 
        "\nSecond Quiz: " + secondQuizInt + 
        "\nThird Quiz: " + thirdQuizInt + 
        "\nFourth Quiz: " + fourthQuizInt + 
        "\nQuiz Total: " + quizTotal + 
        "\n\nFirst Midterm: " + firstMidterm + 
        "\nSecond Midterm: " + secondMidterm +
        "\nTotal Midterm: " + midtermTotal + 
        "\n\nFinals: " + finalsInt +
        "\n\nQuiz: " + quizPercentage + "%" +
        "\nMidterm: " + midtermPercentage + "%" +
        "\nFinals: " + finalsPercentage + "%" +
        "\n------" + 
        "\nTotal: " + average;

        // Show output.
        JOptionPane.showMessageDialog(null, messageOutput, "Average Score", JOptionPane.INFORMATION_MESSAGE);
    }
}
