package oop;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class Bicycle {
    
    public static void main(String[] args) {
        /*
         * Declare radiusStr ,  
         */
        String radiusStr; 
        radiusStr = JOptionPane.showInputDialog("Please Enter Radius: ");

        double radius;
        double area;
        double circumference;

        radius = Double.parseDouble(radiusStr);
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * area;

        DecimalFormat df = new DecimalFormat("%.000");

        String message = "Radius: " + df.format(radius) + "\nArea: " + df.format(area) + "\nCircumference: " + df.format(circumference);

        JOptionPane.showMessageDialog(null, message, "Area and Circumference of a Circle", JOptionPane.INFORMATION_MESSAGE);


        for(int i = 0; i < 10; i ++)
        {
            System.out.printf("%d \n", i);
        }
    }
}

