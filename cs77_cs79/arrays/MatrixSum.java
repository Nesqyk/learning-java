package cs77_cs79.arrays;

/**
 * Programmer: Tabornal, Tyrone M.
 * Description: A program that prints out the sum of two different matrix.
 * Activity: Activity in Array 2.
 */

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        double[][] firstMatrix = new double[2][2];
        double[][] secondMatrix = new double[2][2];
        double[][] sumMatrix = new double[2][2]; // New matrix for the sum

        Scanner s = new Scanner(System.in);

        System.out.println("Enter elements of 1st matrix");
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                System.out.print("Enter a" + (row + 1) + (col + 1) + ": ");
                firstMatrix[row][col] = s.nextDouble();
            }
        }

        System.out.println("Enter elements of 2nd matrix");
        for (int row = 0; row < secondMatrix.length; row++) {
            for (int col = 0; col < secondMatrix[row].length; col++) {
                System.out.print("Enter a" + (row + 1) + (col + 1) + ": ");
                secondMatrix[row][col] = s.nextDouble();
            }
        }

        // Calculate the sum in a separate loop
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                sumMatrix[row][col] = firstMatrix[row][col] + secondMatrix[row][col];
            }
        }

        // Print the output of the 2d Sum of Matrix[n][n]
        System.out.println("\nSum of Matrix:");
        for (int row = 0; row < sumMatrix.length; row++) {
            for (int col = 0; col < sumMatrix[row].length; col++) {
                System.out.printf("%.1f ", sumMatrix[row][col]); // Print the sumMatrix
            }
            System.out.println();
        }
    }
}