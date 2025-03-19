package practice.practical;

import java.util.Scanner;

public class PracticeOne {
    

    public static void main(String[] args) {
        
        double firstGrade = 85.0, secondGrade = 88.0, thirdGrade = 75.0, fourthGrade = 87.0, fifthGrade = 78.0;

        int intChoice = 0;

        Scanner s = new Scanner(System.in);


        double highestGrade = firstGrade;
        double lowestGrade = firstGrade;

        int numAboveAverage = 0;

        String displayChoices =  "\nMenu:\n"+"1. View Grades" +
        "\n2. Add points Data for a Grade" + 
        "\n3. Change Password" +
        "\n4. Calcualte Variance" +
        "\n5. Calculate Standard Deviation" + 
        "\n6. Exit" ; 

        String welcomeDisplay = "Welcome to the Student Grade Analysis Program\n";
        System.out.print(welcomeDisplay + "\nEnter Username : ");
        String username = s.nextLine();

        System.out.print("Enter password : ");
        String password = s.nextLine();
        String passwordNew = "";

        if(!username.equals("admin")) {
            // if newpassword is = we compare with password
            // else compare with new password
            System.out.println("Failed ! Wrong Username");
            return;
        } 

        if(!passwordNew.equals("")) {
            password = "password";
        } else {
            password = passwordNew;
        }

        if(!passwordNew.equals(password)) {
            System.out.println("Failed to Login, Pease Try Again!");
            return;
        }

        System.out.println("Login successfully!");

    
        do {
            System.out.println(displayChoices);
            System.out.print("Enter Choice : ");
            intChoice = s.nextInt();

            double sum = firstGrade + secondGrade + thirdGrade + fourthGrade + fifthGrade;
            int numGrades = 5;
    
            double average = getMean(sum, numGrades);

            if(secondGrade > highestGrade) highestGrade = secondGrade;
            if(secondGrade < lowestGrade) lowestGrade = secondGrade;

            if(thirdGrade > highestGrade) highestGrade = thirdGrade;
            if(thirdGrade < lowestGrade) lowestGrade = thirdGrade;

            if(fourthGrade > highestGrade) highestGrade = fourthGrade;
            if(fourthGrade < lowestGrade) lowestGrade = fourthGrade;

            if(fifthGrade > highestGrade) highestGrade = fifthGrade;
            if(fifthGrade < lowestGrade) lowestGrade = fifthGrade;

            if(firstGrade > average) numAboveAverage++;
            if(secondGrade > average) numAboveAverage++;
            if(thirdGrade > average) numAboveAverage++;
            if(fourthGrade > average) numAboveAverage++;
            if(fifthGrade > average) numAboveAverage++;


            switch(intChoice) {
                case 1: 
                    String displayGrades = 
                    "\nGrade-1: " + firstGrade + 
                    "\nGrade-2: " + secondGrade + 
                    "\nGrade-3: " + thirdGrade + 
                    "\nGrade-4: " + fourthGrade + 
                    "\nGrade-5: " + fifthGrade;

                    String salesDataStatistics = 
                    "\n\nSales Data and Statistics:" + 
                    "\nTotal Grades : " + sum + 
                    "\nAverage Grades : " + average + 
                    "\nHighest Grade : " + highestGrade +
                    "\nLowest Grade : " + lowestGrade +
                    "\nGrades with Above Average : " + numAboveAverage; 

                    System.out.println(displayGrades + salesDataStatistics);
                    
                    break; 
                case 2: 
                    // adding points;
                    System.out.print("Enter your product number (1-5) : ");
                    int productChoice = s.nextInt();
                    if(productChoice < 0 && productChoice > 5) {
                        System.out.println("Please enter only product num from 1- 5 ");
                        continue;
                    }
                    System.out.print("Enter the value for Grade " + productChoice + " : ");
                    int addedValue = s.nextInt();

                    switch (productChoice) {
                        case 1: firstGrade += addedValue; break;
                        case 2: secondGrade += addedValue; break;
                        case 3: thirdGrade += addedValue; break;
                        case 4: fourthGrade += addedValue; break;
                        case 5: fifthGrade += addedValue; break;
                    }
                    break;
                case 3:
                    System.out.print("Please enter a new password : ");
                    s.nextLine();
                    String newPassword = s.nextLine();

                    passwordNew = newPassword;
                    break;
                case 4:
                    double variance = getVariance(firstGrade, secondGrade, thirdGrade, fourthGrade, fifthGrade, average);
                    System.out.println("Variance : " + variance);
                    break;
                case 5:
                    double stndDev = getDeviation(firstGrade, secondGrade, thirdGrade, fourthGrade, fifthGrade, average);
                    System.out.println("Standard Deviation : "  + stndDev);
                    break;
            }
        } while(intChoice != 6);
        System.out.println("Exiting Now...");
    }

    static double getMean(double sum, int n) {
        return sum / n;
    }

    static double getDeviation(double grade_1,double grade_2,double grade_3,double grade_4,double grade_5, double average) {
        return Math.sqrt(getVariance(grade_1, grade_2, grade_3, grade_4, grade_5, average));
    }

    static double getVariance(double grade_1,double grade_2,double grade_3,double grade_4,double grade_5, double average){
        
        double differOne = average - grade_1;
        double differTwo = average - grade_2;
        double differThree = average - grade_3;
        double differFour = average - grade_4;
        double differFive = average - grade_5;

        double variance = ((differOne * differOne) + (differTwo * differTwo) + (differThree * differThree) + (differFour * differFour) + (differFive * differFive)) / 5.0;

        return variance;
    }


}
