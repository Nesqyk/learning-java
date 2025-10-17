package course.activities.march;


/**
 * Programmer: Tabornal, Tyrone M.
 * Description: A program that calculates the student's book credit base on their grade.
 * Activity: 15
 */

import java.util.Scanner;

public class StudentCredit {

    private String name;
    private double grade;

    public StudentCredit() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        this.name = s.nextLine();

        System.out.print("Enter the student's grade: ");
        this.grade = s.nextDouble();

        s.close();
    }

    // Coverts grade into book credit
    public int getBookCredit() {
        return (int)(grade * 10);
    }

    // Converts student information to string
    public String toString() {
        return "Name : " + this.name + "\nGrade Point : " + grade + "\nBookstore Credit : " + getBookCredit(); 
    }

    // Prints out the student's information
    public void displayInformation() {
        System.out.println("\n" + this.name + "'s Information\n"  + toString());
    }
    
    public static void main(String[] args) {
        StudentCredit studentOne = new StudentCredit();
        studentOne.displayInformation();
    }
}
