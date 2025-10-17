package course.activities.march;
/**
 * Programmer : Tabornal, Tyrone M.
 * Description: Student class with attributes: name, age.
 * Activity: 12
 */
public class Student {
    
    // Declare the attributes for the student
    public String name;
    public int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Parse student's attribute into string.
    public String toString() {
        return "Student's Name : " + name + "\nStudent's Age: " + age;
    }

    // Prints the student's details
    public void printStudentDetails() {
        System.out.println("\nStudent Details\n" + toString());
    }
}
