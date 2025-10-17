package course.practice;
import java.util.Scanner;

public class test {

    public static void main(String args[]) {

        // Pyramid

        int size = 5;
        for(int i = 1; i <= size; i++) {
            // spaces for the pyramid
            for(int j = 1 ; j <= size - i ; j++) {
                System.out.print(" ");
            }

            // print the stars
            for(int j = 1; j <= i ; j++) {
                System.out.print("*");
                if(j <  i) {
                    System.out.print(" "); 
                }
            } 
            System.out.println();
        }

        // half pyramid

        for(int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // inverted

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sumSeries(5);
    }

    public static void sumSeries(int n) {

        int sum = 0;
        int terms = 9;
        for(int i = 0; i < n; i++) {
            System.out.print(terms + " ");

            //  terms will update every n of loop
            sum += terms;

            // 9 * 10 + 9 first iteration
            terms = terms * 10 + 9;

            
        }

        System.out.println("Sum series : " + sum);
        // <3
    }

}
