package practice.loops;

import java.util.Scanner;

public class JavaPractice {
    

    public static void main(String[] args) {
        // readPersonsAges();
        // guideTommy();

        // halfTriangle();
        // triangle(5);

        sumSeries(5);
    }

    public static void readPersonsAges() {

        Scanner s = new Scanner(System.in);
        int babyCount = 0, teenageCount = 0, adultCount = 0;
        for (int i = 0; i < 15; i++) {
            System.out.print("Please enter age for Person : " + (i + 1) + " ");

            int age = s.nextInt();

            if(age >= 0 && age <= 5) {
                babyCount++;
            } else if(age >= 6 && age <= 17){
                teenageCount++;
            } else if(age >= 18){
                adultCount++;
            }
        }

        s.close();
        System.out.println("Babies : " + babyCount);
        System.out.println("Teenagers : " + teenageCount);
        System.out.println("Adults : " + adultCount);
    }

    public static void guideTommy() {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        for(int i = 0 ; i < size; i++) {

            System.out.printf("%d", i);
            if((i % 10) == 0 && i != 0) {
                System.out.println();
            } else if(i < size - 1){
                System.out.print(" * ");
            }
        }

        s.close();
    }

    public static void halfTriangle() {

        for(int i = 0 ; i < 5; i ++) {

            for(int j = 0 ; j < i; j++) {
                System.err.print("*");
            }

            System.out.println();
        }
    }

    public static void triangle(int size) {
        
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if(j < i) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void sumSeries(int n_terms) {
        // prompt user for input
        // sum the n terms
        // sum += terms
        // terms = 9 * i

        int sum = 0, term = 9;

        for(int i = 0; i < n_terms; i++) {
            System.out.print(term + " ");
            sum += term;
            term = term *  10 + 9;
        }

        System.out.println("Sum of it :  " + sum);
    }

    public void binaryToDecimal(int b) {

        int binary, decimal = 0, remainder = 0, i = 0;

        Scanner s = new Scanner(System.in);

        binary = s.nextInt();

        while(binary != 0) {
            remainder = binary % 10;

            decimal = remainder + (2 * i);

            binary /= 10;

            i++;
        }

        s.close();
    }
}
