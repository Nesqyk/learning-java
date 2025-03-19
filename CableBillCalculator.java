
/**
 * Programmer: Tabornal, Tyrone M.
 * Description: A program tha calculates the total bill 
 */

import javax.swing.JOptionPane;

public class CableBillCalculator {

    public static void main(String[] args) {
        // Get account number and customer type
        int accountNumber = getAccountNumber();
        char customerCode = getCustomerCode();

        // Calculate bill based on customer type
        double totalBill = 0.0;

        switch (Character.toUpperCase(customerCode)) {
            case 'R':
                totalBill = calculateResidentialBill();
                break;
            case 'B':
                totalBill = calculateBusinessBill();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid customer code!");
                System.exit(0); // Exit if invalid code
        }

        // Display final bill
        displayBill(accountNumber, customerCode, totalBill);
    }

    // Ask for account number
    static int getAccountNumber() {
        String input = JOptionPane.showInputDialog("Enter account number:");
        return Integer.parseInt(input);
    }

    // Ask for customer code (R/r or B/b)
    static char getCustomerCode() {
        String input = JOptionPane.showInputDialog("Enter Customer Code (R/r = Residential, B/b = Business):");
        return input.charAt(0);
    }

    // Calculate bill for residential customer
    static double calculateResidentialBill() {
        final double PROCESSING_FEE = 4.50;
        final double BASIC_SERVICE_FEE = 20.50;
        final double PREMIUM_CHANNEL_COST = 7.50;

        int premiumChannels = getNumber("Enter number of premium channels:");

        // Total for residential
        return PROCESSING_FEE + BASIC_SERVICE_FEE + (premiumChannels * PREMIUM_CHANNEL_COST);
    }

    // Calculate bill for business customer
    static double calculateBusinessBill() {
        final double PROCESSING_FEE = 15.00;
        final double BASE_FEE = 75.00; // Covers first 10 connections
        final double ADDITIONAL_CONNECTION_COST = 5.00;
        final double PREMIUM_CHANNEL_COST = 50.00;

        // Ask for basic and premium connections
        int basicConnections = getNumber("Enter number of basic service connections:");
        int premiumChannels = getNumber("Enter number of premium channels:");

        // Calculate basic service fee (extra charge for more than 10 connections)
        double basicServiceFee = (basicConnections <= 10) ? BASE_FEE 
                                                           : BASE_FEE + (basicConnections - 10) * ADDITIONAL_CONNECTION_COST;

        // Total for business
        return PROCESSING_FEE + basicServiceFee + (premiumChannels * PREMIUM_CHANNEL_COST);
    }

    //  Method to get integer input from user
    static int getNumber(String message) {
        String input = JOptionPane.showInputDialog(message);
        return Integer.parseInt(input);
    }

    // Display final bill information
    static void displayBill(int accountNumber, char customerCode, double totalBill) {
        String customerType = (Character.toUpperCase(customerCode) == 'R') ? "Residential" : "Business";

        String message = "Account Number: " + accountNumber +
                         "\nCustomer Type: " + customerType +
                         "\nTotal Bill: $" + String.format("%.2f", totalBill);

        JOptionPane.showMessageDialog(null, message, "Bill Details", JOptionPane.INFORMATION_MESSAGE);
    }
}
