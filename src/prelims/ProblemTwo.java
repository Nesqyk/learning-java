package prelims;

import java.util.Scanner;

public class ProblemTwo {
    
    public static void main(String[] args) {
        // km to ft
        // inches to mm
        Scanner s = new Scanner(System.in);
        int km = s.nextInt();
        int inches = s.nextInt();

        double feet = (km * 1000)  * 3.28; 

        // 1 inch is 2.54 cm
        // 1 mm is 0.10 cm
        double mm = ((inches * 2.54) / 1 * 10);

        System.err.println("Km to Feet : " + km);
        System.err.println("Inches to Milimeter : " + mm);

    }
}
