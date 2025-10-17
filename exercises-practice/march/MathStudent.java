package course.activities.march;


/**
 * Programmer: Tabornal, Tyrone M.
 * Description: A program that calculates the student's membership base on their grade.
 * Activity: 16
 */

public class MathStudent {
    
    private String name;
    private double mathGrade;

    // MathStudent Constructor
    public MathStudent(String name, double mathGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
    }

    // Returns the student's math grade
    public double getMathGrade() {
        return this.mathGrade;
    }
    
    // Returns student's name
    public String getName() {
        return this.name;
    }
}
