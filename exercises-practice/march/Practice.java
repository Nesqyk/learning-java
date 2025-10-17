package course.activities.march;
import java.util.Scanner;

public class Practice {
    

    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        do {
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    
                    break;
                case 2:

                case 3: return;
            }
        } while(true);
    }

    static void processDiagonalMatrix() {
        int[][] matrix = populateMatrix(3);

        int[][] sumMatrix = calculateSumMatrix(matrix, true);


    }

    // if i == j then 
    // else 0

    static void processSquareMatrix() {



    }
    
    static int[][] calculateSumMatrix(int[][] matrix, boolean diagonal) {

        int[][] matrixSum = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            int base = diagonal ? matrix[row][0] : matrix[row][row]; 
            for (int col = 0; col < matrix.length; col++) {
                matrixSum[row][col] = matrix[row][col] + base;
            }
        }
        return matrixSum;
    }

    static boolean isValid(int col, int row) {
        if(col != row) {
            System.out.println("Rows and columns shouldb equal");
        }
        return col == row;
    }

    static int[][] populateMatrix(int size) {

        int[][] matrix = new int[size][size];
        Scanner s = new Scanner(System.in);
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = s.nextInt();
            }
            System.out.println();
        }
        return matrix;
    } 
 
    static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
    // square matrix sum is 
    // matrix[row][0] + matrix[row][col]

    // diagonal 
    // matrix[row][row] + matrix[row][col]
}
