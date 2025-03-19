import javax.swing.JOptionPane;

public class Sales {
    
    
    public static void main(String[] args) {
        // purchase product
        //
        
        int productAStock = 10, productBStock = 15, productCStock = 20;
        int productAPrice = 50, productBPrice = 30, productCPrice = 20;

        int totalSalesA = 0, totalSalesB = 0, totalSalesC = 0;

        do 
        {
            String choiceInput = JOptionPane.showInputDialog("1. Purchase a product\r\n" + //
                                "2. Check product stock\r\n" + //
                                "3. View total sales\r\n" + //
                                "4. View low-stock products (threshold: 5 or fewer)\r\n" + //
                                "5. Exit the program\r\n");
            int parsedChoice = Integer.parseInt(choiceInput);

            switch (parsedChoice) 
            {
                case 1:
                    String selectedProduct =  JOptionPane.showInputDialog("List of Products : \n (A) Product A , (B) Product B, (C) Product C");
                    char selectedProductChar = selectedProduct.charAt(0);

                    String quantityInput = JOptionPane.showInputDialog("Please enter the amount you want to purchase");
                    int quantityInt = Integer.parseInt(quantityInput);
                    int productStock = 0;
                    int price = 0;
                    

                    // how can I make sure that if the stock of a certain product turns to 0 it will cancel?
                    switch (selectedProductChar) 
                    {
                        case 'A': productStock = productAStock; price = productAPrice; productAStock -= quantityInt; break;
                        case 'B': productStock = productBStock; price = productBPrice; productBStock -= quantityInt;  break;
                        case 'C': productStock = productCStock; price = productCPrice; productCStock -= quantityInt; break;
                    }

                    if(quantityInt > productStock && productStock == 0) {
                        JOptionPane.showMessageDialog(null, "Please make sure that the quantity you \ninputted is not greater than the stock of that product", "", productStock);
                        continue;
                    }

                    int totalPrice = price * quantityInt;

                    if(totalPrice >= 200) {
                        totalPrice -= (totalPrice * 0.10);
                    }

                    switch(selectedProductChar) {
                        case 'A': totalSalesA += totalPrice; break;
                        case 'B': totalSalesB += totalPrice; break;
                        case 'C': totalSalesC += totalPrice; break;

                    }

                    break;
                case 2:

                    String outputString = "Stock for Product A : " +  productAStock + "\n Stock for Product B : " + productBStock + "\nStock for Product C : " + productCStock;
                    JOptionPane.showMessageDialog(null, outputString, "Stocks for each each product", JOptionPane.INFORMATION_MESSAGE);

                    break;
                case 3:

                    String salesOutput = "Total Sales for Product A : " + "$" +  totalSalesA + "\nTotal Sales for Product B : " + "$" +  totalSalesB +"\nTotal Sales for Product C : " + "$" +  totalSalesC;
                    JOptionPane.showMessageDialog(null, salesOutput, "Sales", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 4:
                // low stock products
                    String lowStockProducts = "";

                    if(productAStock <= 5) {
                        lowStockProducts += "Product A \n";
                    }
                    
                    if(productBStock <= 5) {
                        lowStockProducts += "Product B \n";
                    } 

                    if(productBStock <= 5) {
                        lowStockProducts += "Product C \n";
                    } 

                    lowStockProducts = lowStockProducts.equals("") ? "No products less than the threshold 5": lowStockProducts ;

                    JOptionPane.showMessageDialog(null, lowStockProducts, "Low Stock Products", JOptionPane.INFORMATION_MESSAGE);

                    break;
                case 5: 
                    String salesOutputExit = "Total Sales for Product A : " + "$" +  totalSalesA + "\nTotal Sales for Product B : " + "$" +  totalSalesB +"\nTotal Sales for Product C : " + "$" +  totalSalesC;
                    JOptionPane.showMessageDialog(null, salesOutputExit, "Sales", JOptionPane.INFORMATION_MESSAGE);
                return;

                default:
                    break;
            }        
        } while(true);
    }
}
