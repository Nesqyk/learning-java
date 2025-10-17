package course.activities.march;
/**
 * Programmer: Tabornal, Tyrone M.
 * Description: A program that calculates the student's membership base on their grade.
 * Activity: 16
 */
 
import java.util.Scanner;

public class MathClubManager {

    // Calculates the free membership
    public void calculateMembership(MathStudent mStudent) {
        int scores = 0;
        if(mStudent.getMathGrade() > 90) {
            scores = (int)(mStudent.getMathGrade() - 90);
        }
        if(scores > 0) {
            System.out.println("You are qualified for a " + scores + " month(s)  of free membership!");
        } else {
            System.out.println("You are not qualified for a free membership!");
        }
    }
    
    // Displays Student's Information
    public void displayResult(MathStudent mStudent) {
        System.out.println("\nStudent Name : " + mStudent.getName() + "\nStudent Math Grade : " + (int)mStudent.getMathGrade() + "%") ;
        calculateMembership(mStudent); 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Student's Name : ");
        String name = s.nextLine();

        System.out.print("Enter Student's Math Grade Percentage : ");
        double mathGrade = s.nextDouble();

        MathStudent mStudent = new MathStudent(name, mathGrade);

        MathClubManager manager = new MathClubManager();
        manager.displayResult(mStudent);
    }
}
