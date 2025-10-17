package course.practice;
/**
 * Programmer: Tabornal, Tyrone M.
 * Description: This program uses method overloading to display a salutation based on a customer's name, followed by a thank-you message.
 * Activity: 3
 */

class FormLetterWriter {

    // Displays salutation using last name only
    static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName);
        System.out.println("Thank you for your recent order.\n");
    }

    // Overloaded method: Displays salutation using first and last name
    static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order.\n");
    }

    public static void main(String[] args) {
        // Test: Single-parameter method
        displaySalutation("Smith");

        // Test: Two-parameter method
        displaySalutation("John", "Doe");
    }
}
