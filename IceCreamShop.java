/** 
  * Programmer: Tabornal, Tyrone M.
  * Quiz: 3
  * Description: Ice cream shop system that tracks customer orders, manages stock for each flavor, and displays an end-of-day summary.
  */
import javax.swing.JOptionPane;

public class IceCreamShop {

    public static void main(String[] args) {

        // Get initial stock for each flavor (individual variables)
        int vanillaStock = getStockForFlavor("Vanilla");
        int chocolateStock = getStockForFlavor("Chocolate");
        int strawberryStock = getStockForFlavor("Strawberry");
        int mintChocoStock = getStockForFlavor("Mint Chocolate Chip");

        // Variables to control shop status and customer count
        boolean shopOpen = true;
        int customersServed = 0;

        // Step 2: Flag-controlled loop to serve customers
        while (shopOpen) {
            // Check if all flavors are out of stock
            if (isAllOutOfStock(vanillaStock, chocolateStock, strawberryStock, mintChocoStock)) {
                JOptionPane.showMessageDialog(null, "All flavors are out of stock! Shop is now closed.");
                break;
            }

            // Get number of scoops (1-3) or 0 to quit
            int scoops = getNumberOfScoops();
            if (scoops == 0) {
                shopOpen = false;
                break;
            }

            // Get flavor choice and check stock
            String flavor = getFlavorChoice();
            boolean validOrder = false;

            if (flavor.equalsIgnoreCase("Vanilla")) {
                if (vanillaStock >= scoops) {
                    vanillaStock -= scoops;
                    validOrder = true;
                } else {
                    showOutOfStockMessage("Vanilla");
                }
            } else if (flavor.equalsIgnoreCase("Chocolate")) {
                if (chocolateStock >= scoops) {
                    chocolateStock -= scoops;
                    validOrder = true;
                } else {
                    showOutOfStockMessage("Chocolate");
                }
            } else if (flavor.equalsIgnoreCase("Strawberry")) {
                if (strawberryStock >= scoops) {
                    strawberryStock -= scoops;
                    validOrder = true;
                } else {
                    showOutOfStockMessage("Strawberry");
                }
            } else if (flavor.equalsIgnoreCase("Mint Chocolate Chip")) {
                if (mintChocoStock >= scoops) {
                    mintChocoStock -= scoops;
                    validOrder = true;
                } else {
                    showOutOfStockMessage("Mint Chocolate Chip");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid flavor! Please choose from the list.");
            }

            if (validOrder) {
                customersServed++;
            } else {
                continue; // If order failed, ask again.
            }

            // Ask if there are more customers
            int moreCustomers = JOptionPane.showConfirmDialog(null, "Serve another customer?", "Next Customer", JOptionPane.YES_NO_OPTION);
            if (moreCustomers != JOptionPane.YES_OPTION) {
                shopOpen = false;
            }
        }

        // Show end-of-day summary
        displaySummary(customersServed, vanillaStock, chocolateStock, strawberryStock, mintChocoStock);
    }

    // Function to get initial stock for a flavor
    static int getStockForFlavor(String flavor) {
        String input = JOptionPane.showInputDialog("Enter initial stock for " + flavor + ":");
        return Integer.parseInt(input);
    }

    // Function to check if all flavors are out of stock
    static boolean isAllOutOfStock(int vanilla, int chocolate, int strawberry, int mintChoco) {
        return vanilla == 0 && chocolate == 0 && strawberry == 0 && mintChoco == 0;
    }

    // Function to get number of scoops (1-3), or 0 to quit
    static int getNumberOfScoops() {
        String input = JOptionPane.showInputDialog("Enter number of scoops (1-3) or 0 to stop ordering:");
        int scoops = Integer.parseInt(input);

        if (scoops < 0 || scoops > 3) {
            JOptionPane.showMessageDialog(null, "Invalid number! Enter 1 to 3 scoops.");
            return getNumberOfScoops(); 
        }
        return scoops;
    }

    // Function to get flavor choice from customer
    static String getFlavorChoice() {
        return JOptionPane.showInputDialog("Available Flavors:\n"
                + "- Vanilla\n"
                + "- Chocolate\n"
                + "- Strawberry\n"
                + "- Mint Chocolate Chip\n"
                + "Enter your flavor choice:");
    }

    // Function to show out-of-stock message for a flavor
    static void showOutOfStockMessage(String flavor) {
        JOptionPane.showMessageDialog(null, flavor + " does not have enough scoops left! Please choose another flavor.");
    }

    // Function to display final summary of the day
    static void displaySummary(int customersServed, int vanilla, int chocolate, int strawberry, int mintChoco) {
        String summary = "End of Day Summary\n"
                + "Customers Served: " + customersServed + "\n"
                + "Vanilla remaining: " + vanilla + "\n"
                + "Chocolate remaining: " + chocolate + "\n"
                + "Strawberry remaining: " + strawberry + "\n"
                + "Mint Chocolate Chip remaining: " + mintChoco;

        JOptionPane.showMessageDialog(null, summary);
    }
}
