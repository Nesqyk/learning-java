/**
 * Programmer: Tabornal, Tyrone M.
 * Description: A program that implements method overloading
 * Activity: 8
 */

public class Billing {

     // Computes total price including tax for a single book
     public static double computeBill(int bookPrice) {
        double taxRate = 0.08; // 8% tax

        double totalDue = bookPrice + (bookPrice * taxRate);

        return totalDue;
    }

    // Computes total price including tax for multiple books
    public static double computeBill(int bookPrice, int quantityOrdered) {
        double taxRate = 0.08; // 8% tax

        int subtotal = bookPrice * quantityOrdered;
        double totalDue = subtotal + (subtotal * taxRate);

        return totalDue;
    }

    // Computes total price including tax and applies a discount coupon
    public static double computeBill(int bookPrice, int quantityOrdered, int couponValue) {
        double taxRate = 0.08; // 8% tax

        int subtotal = (bookPrice * quantityOrdered) - couponValue;
        double totalDue = subtotal + (subtotal * taxRate);

        return totalDue;
    }

    public static void main(String[] args) {
        System.out.println("Single book total: $" + computeBill(100));
        System.out.println("Multiple books total: $" + computeBill(100, 3));
        System.out.println("Total after coupon: $" + computeBill(100, 3, 50));
    }
}
