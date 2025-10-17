package course.practice;

import javax.swing.JOptionPane;

/*
 * Programmer: Tabornal, Tyrone.
 * Description: A program that generates telephone bill 
 */

public class practical {
    public static void main(String[] args){
        // HELLO NGA WORLD!

        //  Typ of Services: Regular ug Premium


        // Prompt User The ff
        // Enter Account Number
        // Service code (char) P -> premium  | R -> regular | else error
        // The number of minutes the service was used
        // Output:
        // Account Number, 
        // type of service,
        // number of minutes the account was used,
        // the amount due from the user
        
        //  premium-> can call during the day and night
        // number of minutes -> during th day
        // number of minutes-> during the night.



        String inputAccount = JOptionPane.showInputDialog("Please enter your account Number: ");

        int accountNumber = Integer.parseInt(inputAccount);

        String inputServiceCode = JOptionPane.showInputDialog("Please Enter Service Code (P) for Premium | (R) for Regular");

        char serviceCode = inputServiceCode.charAt(0);

        int intMinutes = 0;
        double balance = 0.0;
        int serviceDay = 0;
        int serviceNight = 0;

        switch(serviceCode)
        {
            case 'P', 'p':
                serviceDay = Integer.parseInt(JOptionPane.showInputDialog("Please Enter the No. of Minutes the Service was Used During the DAY"));
                serviceNight = Integer.parseInt(JOptionPane.showInputDialog("Please Enter the No. of Minutes the Service was Used During the NIGHT"));

                balance += 25.00;
                if(serviceDay > 75)
                {
                    balance += (serviceDay - 75) * 0.10;
                }

                if(serviceNight > 100)
                {
                    balance += (serviceNight - 100) * 0.05;
                }
                break;

            case 'R', 'r': 
                String inputNoMinutes = JOptionPane.showInputDialog("Please Enter the No. of Minutes the Service was Used");

                intMinutes = Integer.parseInt(inputNoMinutes);
                balance += 10.00;
                if(intMinutes > 50)
                {
                    balance += (intMinutes - 50) * 0.20;
                }

            // <= 50 is free + 10.00
            // if minutes >= 50 then + 10.00
            // else minutes * 0 .20;
            // overtime = 50 - minutes;
                break;
        }

        // Account Number, 
        // type of service,
        // number of minutes the account was used,
        // the amount due from the user

        String message = "";

        String typeOfService = serviceCode == 'P' || serviceCode == 'p' ? "(P) Premium" : "(R) Regular";

        int totalTime = serviceCode == 'P' || serviceCode == 'p' ? serviceDay + serviceNight : intMinutes;

        message = "Account Number : " + accountNumber + 
                "\nType of Service : " + typeOfService +
                "\nNumber of Minutes the Telephone Service Was Used : " + totalTime + " Minutes" +
                "\nYour Due Amount : " + balance + " PHP";
    
        JOptionPane.showMessageDialog(null, message, "Your Bill for Today", JOptionPane.INFORMATION_MESSAGE);


    }


}