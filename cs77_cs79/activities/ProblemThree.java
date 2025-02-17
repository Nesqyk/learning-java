package cs77_cs79.activities;
/*
 * Activity: 3
 * Description: A program that outputs the; left, middle, tail; of a three digit int.
 * Author: Tabornal, Tyrone M.  
 */

import javax.swing.JOptionPane;

 public class ProblemThree {


    public static void main(String[] args) {

        String inputSting = JOptionPane.showInputDialog("Entre a 3-digit number: ");

        int parseInt = Integer.parseInt(inputSting);

        int leftMostDigit = parseInt / 100;
        int middleDigit = parseInt / 10 % 10;
        int tailDigit = parseInt % 10;

        String outputMsg =  "The first digit of " + parseInt + "is: " + leftMostDigit +
        "\nThe middle digit of " + parseInt + "is: "+ middleDigit +
        "\nThe tail digit of " + parseInt + "is: " + tailDigit;

        JOptionPane.showMessageDialog(null, outputMsg, "Output", JOptionPane.PLAIN_MESSAGE);
        
    }
 }