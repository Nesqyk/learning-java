package cs77_cs79.practice;

import java.util.Scanner;

public class ProblemOne 
{
    public static void main(String[] args) 
    {
        // Declare the min and max;
        int max = 99;
        int min = 1;

        int range = (max-min) + 1;
        int randomNum = (int)(Math.random() * range) + min;

        int num = -1;
        Scanner s = new Scanner(System.in);
        
        boolean flag = randomNum == num; // true or false

        do {
            System.out.printf("\n\nPlease enter a number: ");
            num = s.nextInt();

            if(num < randomNum) {
                System.out.println();
                System.out.println("Your guess is lower than the number.");
                continue;
            } else if(num > randomNum) {
                System.out.println("Your guess is higher than the number.");
                continue;
            }  
            break;   
        } while(!flag);

        System.out.printf("\nYou've guessed the right number!");
        s.close();

    }

}