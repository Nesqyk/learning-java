package prelims;

import java.util.Scanner;

public class ProblemOne {


    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int numberSeconds = console.nextInt();

        int year = numberSeconds / (60 * 60 * 24 * 365);
        int remainingSeconds = numberSeconds % (60 * 60 * 24 * 365);

        int weeks = remainingSeconds/ (60 * 60 * 24 * 7);
        remainingSeconds = remainingSeconds % (60 * 60 * 24 * 7);

        int days = remainingSeconds / (60 * 60 * 24);
        remainingSeconds = remainingSeconds % (60 * 60 * 24);

        int hours = remainingSeconds / (60 * 60);
        remainingSeconds = remainingSeconds % (60 * 60);

        int minutes = remainingSeconds / 60;

        int seconds  = remainingSeconds % 60;

        System.err.println("Year : " + year);
        System.err.println("Week : " + weeks);
        System.err.println("Day : " + days);
        System.err.println("Hours : " + hours);
        System.err.println("Minutes : " + minutes );
        System.err.println("Seconds : " + seconds);

        // hours
        console.close();
    }
}
