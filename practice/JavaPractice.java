package practice;

import java.util.Scanner;

public class JavaPractice {
    


    public static void main(String[] args) {

        //  prompt the user the number of students in class
        // enter test score for each student?
        int n_students;
        do {
            
        }while (true);


    }

    public static double calculateMean(int sum, int n) {
        return (double) sum / n;
    }

    public static double calculateMedian(int n_students, int middle_score1, int middle_score2) {
        double middleScore = 0.0;
        if(n_students % 2 != 0) {
            middleScore = middle_score1;
        } else {
            middleScore = (middle_score1 + middle_score2) / 2;
        }

        return middleScore;
    }

    public static double calculateMode(int n_students, boolean getCount) {
        double modeValue = 0.0;
        double count = 0.0;

        double currentScore = 0.0;
        Scanner s = new Scanner(System.in);

        for(int i = 0 ; i < n_students; i++) {
            currentScore = s.nextDouble();

            if(modeValue < currentScore) {
                modeValue = currentScore;
            } else if(modeValue == currentScore) {
                count++;
            }
        }

        s.close();

        if(getCount) {
            return count;
        } else {
            return modeValue;
        }
        // could prompt the user here
    }
    
}
