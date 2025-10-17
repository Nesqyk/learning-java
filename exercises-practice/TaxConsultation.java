package course.practice;
/**
 * Programmer: Tabornal, Tyrone M.
 * Description: A program that calculates service charge based on income and consulting time: when called.
 * Activity: 7
 */

public class TaxConsultation {

    // Calculates service charge based on income and consulting time.  
    public static double computeServiceCharge(double income, int consultingTime, double hourlyRate) {
        double charge = 0.0;

        if (income <= 25000) { 
            // Low-income condition
            if (consultingTime > 30) {
                charge = 0.40 * hourlyRate * ((consultingTime - 30) / 60.0);
            }
        } else { 
            // Others (income > 25,000)
            if (consultingTime > 20) {
                charge = 0.70 * hourlyRate * ((consultingTime - 20) / 60.0);
            }
        }
        
        return charge;
    }
}
