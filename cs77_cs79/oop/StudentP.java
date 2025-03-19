package cs77_cs79.oop;

/**
 * Programmer : Tabornal, Tyrone M.
 * Description: Student class with attributes: name, age, grades.
 * Activity: 13
 */

public class StudentP {

    private String name;  // Student's Name
    private int age; // Student's Age
    private double[] grades; // Student's grades

    // Constructor
    public StudentP(String name, int age, double[] grades) {
        this.name = name;
        this.grades = grades;
        this.age = age;
    }

    // Calculates and returns average grade
    public double getAverage() {
        if(grades.length == 0 || grades == null) {
            return 0.0;
        }
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    @Override
    // Returns student details as a string
    public String toString() {
        return "Name : " + name + "\nAge : " + age + "\nAverage : " + getAverage();
    }

    // Prints student details
    public void displayInformation(int studentNo) {
        System.out.println("\nStudent No." + studentNo + "'s Details\n" + toString());
    }
}
