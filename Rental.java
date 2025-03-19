/**
 * Programmer: Tyrone M. Tabornal
 * Description:This program calculates car rental costs using method overloading, 
 *             applying discounts based on rental days and cars rented. 
 * Activity:  1
 */

public class Rental {

     public static void main(String[] args) {
        // Renting for 8 days
        System.out.println("Test 1 (8 days): " + calculateRentalCost(8));

        // Renting 100 cars for 8 days
        System.out.println("Test 2 (8 days, 100 cars): " + calculateRentalCost(8, 100));

        // Renting 100 cars for 8 days with $50 discount
        System.out.println("Test 3 (8 days, 100 cars, $50 off): " + calculateRentalCost(8, 100, 50));
     }
    

     // Calculates rental cost based on number of days
    static double calculateRentalCost(int rentalDays) {
        // Base cost ($50 per day)
        double cost = 50.0 * rentalDays; 

        // 5% discount for rentals over 7 days
        double discount = rentalDays > 7 ? 0.05 : 0.0; 

        return cost - (cost * discount); // Apply discount
    }

    // Calculates rental cost based on days and number of cars rented
    static double calculateRentalCost(int rentalDays, int rentedCars) {
        // Total cost for multiple cars
        double cost = (50.0 * rentalDays) * rentedCars; 

        // 5% discount for rentals over 7 days
        double discount = rentalDays > 7 ? 0.05 : 0.0; 

        return cost - (cost * discount); // Apply discount
    }

    // Calculates rental cost with additional discount applied
    static double calculateRentalCost(int rentalDays, int rentedCars, int discountValue) {
        // Base cost
        double cost = (50.0 * rentalDays) * rentedCars;

        // Subtract discount amount
        cost -= discountValue; 

        // 5% discount for rentals over 7 days
        double discount = rentalDays > 7 ? 0.05 : 0.0; 

        
        return cost - (cost * discount); // Apply discount
    }


}
