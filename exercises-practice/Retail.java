package course.practice;
/**
 * Programmer: Tabornal, Tyrone M.
 * Description: This program calculates the retail price of a product based on material costs and production hours.
 * Activity: 2
 */

import java.util.Scanner;

public class Retail {
    

    public static void main(String[] args) {
        // Get user input for product details
        Scanner s = new Scanner(System.in);
    
        System.out.print("Enter product name: ");
        String productName = s.nextLine();
    
        System.out.print("Enter material cost: ");
        double materialsCost = s.nextDouble();
    
        System.out.print("Enter required hours: ");
        int productionHours = s.nextInt();
    
        // Calculate retail price
        double retailPrice = checkRetailPrice(materialsCost, productionHours);
    
        // Display output
        String output = "\nProduct Name: " + productName + 
                        "\nMaterial Cost: " + materialsCost + 
                        "\nRequired Hours: " + productionHours + 
                        "\nRetail Price: " + retailPrice; 
    
        System.out.println(output);
        s.close();
    }
    
    // Calculates retail price based on material cost and production hours
    static double checkRetailPrice(double materialsCost, int productionHours) {
        return (materialsCost + 12) * productionHours + 7;
    }
    
}
