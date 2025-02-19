package random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.math.*;

public class ScannerDemo {


    // float.parsefloat og double.parserdouble

    public static void main(String[] args) {
        //
        // Scanner s = new Scanner(System.in);

        // int i = s.nextInt();

        // String testFloat = JOptionPane.showInputDialog("Please enter float value");

        // Scanner s = new Scanner(System.in);

        // System.out.print("Please enter the radius: ");
        // double radius = s.nextDouble();

        // double area = Math.PI * radius * radius;
        // double circumference = 2 * Math.PI * radius;

        // System.out.println("Area: " + area + "\nCircumference : " + circumference);

        // s.close();

        // float parsedFloat = Float.parseFloat(testFloat);

        // DecimalFormat df = new DecimalFormat("%000");

        // String message = "This is your parsed float: " + df.format(parsedFloat);

        // // warn, error, information, question, plain
        // JOptionPane.showMessageDialog(null,  message, "Parsed Float", 
        // JOptionPane.WARNING_MESSAGE);

        // calculateAverageGUI();
        // calculateAverageScan();
        // generateVariance();

        threeDigit();
    }

    static void calculateAverageScan()
    {
        int []grades;
        int totalSum = 0;
        double average;

        grades = new int[5];


        Scanner s = new Scanner(System.in);

        System.out.println("Please enter five grades: ");

        for(int i = 0 ; i  < grades.length; i++)
        {
            grades[i] = Integer.parseInt(s.nextLine());
            totalSum += grades[i];
        }
        s.close(); // why the need to close a scanner?

        average = totalSum / 5.0;

        // area = πr^2;
        // cricumference = 2πr;

        // celsius = (5.0/9.0) * (farenheit - 32);
        // farenheit = (9.0 / 5.0 * celcius) + 32;
        
        // Variance = summation of deviations ^ 2 / number of deviations 
        // i.e

        // double variance = 0.00;

        // for(int i = 0 ; i < deviations.length; i ++)
        // {
        //     // (deivation * deivation ) + ... / 5.0;

        //     variance += (deviations[i] * deviations[i]);
        //     variance /= 5.0;
        // }

        // deviation = grade - average;
        // 
        //
        System.out.printf("The Average is: %.2f", average);

        // print
        // printf
        // println
    }
    // array of quizzez; 
    static void calculateAverageGUI()
    {
        // delcare the following variables; quizzes, total_sum average
        //  prompt the user for the quizzes
        //      calculate the total sum sa quiz
        //          calculate the average.

        int[] quizzes; 

        int totalSum = 0;

        quizzes = new int[5];

        // prompt the user five times

        for(int i = 0 ; i < 5; i ++)
        {
            String quizInput = JOptionPane.showInputDialog("Please enter 5 quiz scores;");
            quizzes[i] = Integer.parseInt(quizInput);

            totalSum += quizzes[i];
        }

        double average = totalSum / 5.0;

        JOptionPane.showMessageDialog(null, "Average: " + average, "Average sa Quiz", JOptionPane.INFORMATION_MESSAGE);
    }

    static void calculateSalary()
    {
        // REMINDER: do the pseudo code first before coding.

    }

    // summation of 
    static void generateVariance()
    {
        // delcare the following variable; grades, totalScore, average, standardDeviation, deviations, variance,

        int[] grades = new int[5];
        double[] deviations = new double[5];

        int totalGrade = 0;
        double average;

        for(int i = 0 ; i < grades.length; i++)
        {
            String gradesString = JOptionPane.showInputDialog("Please input score for Grade #" + i);

            grades[i] = Integer.parseInt(gradesString);

            totalGrade += grades[i];

            // calcullate variance here.
        } 

        average = totalGrade / 5.0;

        for(int i = 0 ; i < deviations.length; i++)
        {
            deviations[i] = grades[i] - average;
        }

        // calculate variance.

        double variance = 0.00;

        for(int i = 0 ; i < deviations.length; i ++)
        {
            // (deivation * deivation ) + ... / 5.0;

            variance += (deviations[i] * deviations[i]);
            variance /= 5.0;
        }


 
        // JOptionPane.showMessageDialog(null, messageOutput, "", totalGrade);

    }


    static void elapsedHours()
    {
        // 
    }

    static void decimalNum()
    {
        // declare decimals array

        double[] decimals = new double[5];


        for(int i = 0; i < decimals.length; i++)
        {
            String decimalStr = JOptionPane.showInputDialog("Please enter deicmal number for #" + (i + 1) );
            decimals[i] = Double.parseDouble(decimalStr);

            // how can It so that; it will not repeat showing the information five times.

        }

        JOptionPane.showMessageDialog(null, decimals[0] + "\n" + decimals[1] + "\n" + decimals[2] + "\n" + decimals[3] + "\n" + decimals[4], "List of Decimals", JOptionPane.INFORMATION_MESSAGE);

        int[] integers = new int[5];
        int sumTotal = 0;
        double avg;

        for(int i = 0 ; i < integers.length; i ++)
        {
            decimals[i] += 0.5;
            integers[i] =  (int) decimals[i];
            sumTotal += integers[i];
        }

        avg = sumTotal / 5.0;

        DecimalFormat df = new DecimalFormat("0.00");

        JOptionPane.showMessageDialog(null, integers[0] + 
        "\n" + integers[1] + 
        "\n" + integers[2] + 
        "\n" + integers[3] + 
        "\n" + integers[4] +
        "\nSum of Integers: " + sumTotal +
        "\nAverage: " + df.format(avg), "List of Integers", JOptionPane.INFORMATION_MESSAGE);



        // then add 0.5 for each
        // covert it to integers?

        
        // firstDigit = num / 100
        // middleDigit = num / 10 % 10
        // lastdigit = num % 10;
    }

    static void threeDigit()
    {
        // declare the following: firstdigit, middledigit, tail digit
        //  prompt the user for the number
        //      use the formula
        //          give user outpuut

        int firstDigit;
        int middleDigit;
        int tailDigit;

        int nParsed;
        
        while(true)
        {
            String nStr = JOptionPane.showInputDialog("Please enter 3 digit");

            if(nStr.length() != 3)
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.", "ERROR: Invalid Number", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            nParsed = Integer.parseInt(nStr);
            break;
        }

        firstDigit = nParsed / 100;
        middleDigit = nParsed / 10 % 10;
        tailDigit = nParsed % 10;

        String outputMsg =  "The first digit of " + nParsed + " is: " + firstDigit +
        "\nThe middle digit of " + nParsed + " is: "+ middleDigit +
        "\nThe tail digit of " + nParsed + " is: " + tailDigit;

        JOptionPane.showMessageDialog(null, outputMsg, "Output", JOptionPane.INFORMATION_MESSAGE);
    }
}
