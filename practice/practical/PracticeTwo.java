package practice.practical;

import javax.swing.JOptionPane;

public class PracticeTwo {
    

    public static void main(String[] args) {
        // Prompt for each stock for each flavor
        int vanillaStock = getStockForFlavor("Vanilla");
        int chocolateStock = getStockForFlavor("Chocolate");
        int strawberryStock = getStockForFlavor("Strawberry");
        int mintChocoStock = getStockForFlavor("Mint Chocolate Stock");

        boolean shopOpen = true;
        int customersServed = 0;

        while(shopOpen) {
            // 
            if(isAllOutOfStock(vanillaStock, chocolateStock, strawberryStock, mintChocoStock)){
                JOptionPane.showMessageDialog(null, "All flavors are out of stock. Closing the shop now!");
                break;
            }

            // prompt scoop here.
            int scoops = getNumberOfScoops();
            if(scoops == 0) {
                shopOpen = false;
                break;
            }

            String flavor = getFlavorChoice();
            boolean validOrder = false;

            if(flavor.equalsIgnoreCase("Vanilla")) {
                if(vanillaStock >= scoops) {
                    vanillaStock -= scoops;
                    validOrder = true;
                } else {
                    showOutOfStockMessage("Vanilla");
                }
            } else if(flavor.equalsIgnoreCase("Chocolate")) {
                if(chocolateStock >= scoops) {
                    chocolateStock -= scoops;
                    validOrder = true;
                } else {
                    showOutOfStockMessage("Chocolate");
                }
            } else if(flavor.equalsIgnoreCase("Strawberry")) {
                if(strawberryStock >= scoops) {
                    strawberryStock -= scoops;
                    validOrder = true;
                } else {
                    showOutOfStockMessage("Strawberry");
                }
            } else if(flavor.equalsIgnoreCase("Mint Chocolate Chip")) {
                if(mintChocoStock >= scoops) {
                    mintChocoStock -= scoops;
                    validOrder = true;
                } else {
                    showOutOfStockMessage("Mint Chocolate Chip");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a valid flavor from the list");
            }

            if(validOrder) {
                customersServed++;
            } else {
                continue;
            }

            // ask if they still want to continue?

            int moreCustomers = JOptionPane.showConfirmDialog(null, "Serve more customers?", "Do yo uwant to serve more customers?", JOptionPane.YES_NO_OPTION);
            if(moreCustomers != JOptionPane.YES_OPTION) {
                shopOpen = false;
            } 
        }
        showFinaDisplay(vanillaStock, chocolateStock, strawberryStock, mintChocoStock, customersServed);
    }

    static void showOutOfStockMessage(String flavor) {
        JOptionPane.showMessageDialog(null, "Stock for " + flavor + " is out!");
    }

    static String getFlavorChoice() {
        return JOptionPane.showInputDialog("Choose Flavor: \nVanilla\nChocolate\nStrawberry\nMint Chocolate Chip");
    }

    static int getNumberOfScoops() {
        String input = JOptionPane.showInputDialog("Enter number of scoops (1-3) or 0 to quit");
        int scoops = Integer.parseInt(input);

        if(scoops < 0 || scoops > 3) {
            JOptionPane.showMessageDialog(null, "Please enter number from 1-3 only");
            return getNumberOfScoops();
        }
        return scoops;
    }

    static boolean isAllOutOfStock(int vanilla, int chocolate, int strawberry, int mint_choco) {
        return (vanilla == 0) && (chocolate == 0) && (strawberry == 0) && (mint_choco == 0);
    }

    static int getStockForFlavor(String flavor) {
        String input = JOptionPane.showInputDialog("Please enter stock for " + flavor);
        return Integer.parseInt(input);
    }

    static void showFinaDisplay(int vanilla, int chocolate, int strawberry, int mint_choco, int customersServed) {
        String output = "Vanilla Stock : " + vanilla +
        "\nChocolate Stock : " + chocolate + 
        "\nStrawberry : " + strawberry + 
        "\nMint Chocolate Stock : " + mint_choco + 
        "\nTotal Customer Served : " + customersServed;
        JOptionPane.showMessageDialog(null, output, "Details", customersServed);
    }
}
