package prelims;

import java.util.Scanner;

public class ProblemThree {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.err.printf("Enter hourly pay: ");
        int hourlyPay = s.nextInt();

        int totalPay = 0;
        int[] hoursWorked = new int[5];

        for(int i = 0 ; i < hoursWorked.length; i++)
        {
            System.out.printf("Enter no of hours worked for Week #%d : ", i + 1);
            hoursWorked[i] = s.nextInt();
            totalPay += hourlyPay * hoursWorked[i];
        }


        double afterTax = totalPay - (totalPay  * 0.14);

        double clothesAccessories = afterTax * 0.10;

        double schoolSupplies = afterTax * 0.01;

        double savingBonds = afterTax * 0.25;

        double parentsContribution = savingBonds * 0.50;

        System.err.println("Total Income : " + totalPay);
        System.err.println("After Tax : " + afterTax);
        System.err.println("Money Spent on Clothes and Accessories : " + clothesAccessories);
        System.err.println("Money Spent on School Supplies : " + schoolSupplies);
        System.err.println("Money Spend on Saving Bonds : " + savingBonds);
        System.err.println("Parents Contribution : " + parentsContribution);
    }
}
