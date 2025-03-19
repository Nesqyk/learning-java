package cs77_cs79.arrays;

/**
 * Programmer: Tabornal, Tyrone M.
 * Description: A program that displays square and diagonal matrix base on user's input.
 * Activity: 15
 */

 import java.util.Scanner;

 public class MatrixOperations {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
 
         do {
             System.out.print("\n1. Square Matrix\n2. Diagonal Matrix\n3. Exit\nEnter your choice: ");
             int userChoice = s.nextInt();
 
             switch (userChoice) {
                 case 1:
                     processSquareMatrix();
                     break;
                 case 2:
                     processDiagonalMatrix();
                     break;
                 case 3:
                     return;
                 default:
                     System.out.println("Invalid choice. Try again.");
             }
         } while (true);
     }
 
     // Gets matrix size from user and ensures it's a square matrix
     public static int getMatrixSize(String dimension) {
         Scanner s = new Scanner(System.in);
         System.out.print("Enter the number of " + dimension + ": ");
         return s.nextInt();
     }
 
     // Ensures the matrix is square 
     public static boolean validMatrix(int row, int col) {
         if (row != col) {
             System.out.println("Rows and columns should be equal.");
             return false;
         }
         return true;
     }
 
     // Populates a matrix with user input
     public static void populateMatrix(int[][] matrix) {
         Scanner s = new Scanner(System.in);
         for (int row = 0; row < matrix.length; row++) {
             System.out.println("Enter values for row " + (row + 1) + ": ");
             for (int col = 0; col < matrix[row].length; col++) {
                 System.out.print("\tValue for Column " + (col + 1) + ": ");
                 matrix[row][col] = s.nextInt();
             }
         }
     }
 
     // Extracts diagonal elements and returns a diagonal matrix
     public static int[][] getDiagonalMatrix(int[][] matrix) {
         int size = matrix.length;
         int[][] diagonalMatrix = new int[size][size];
 
         for (int row = 0; row < size; row++) {
             diagonalMatrix[row][row] = matrix[row][row]; // Only keep diagonal elements
         }
         return diagonalMatrix;
     }
 
     // Computes the sum matrix
     public static int[][] calculateSumMatrix(int[][] matrix, boolean diagonalMode) {
         int size = matrix.length;
         int[][] sumMatrix = new int[size][size];
 
         for (int row = 0; row < size; row++) {
             int baseValue = diagonalMode ? matrix[row][row] : matrix[row][0];
             for (int col = 0; col < size; col++) {
                 sumMatrix[row][col] = baseValue + matrix[row][col];
             }
         }
         return sumMatrix;
     }
 
     // Handles square matrix processing
     public static void processSquareMatrix() {
         int row = getMatrixSize("rows");
         int col = getMatrixSize("column");
         if (!validMatrix(row, col)) return;
 
         int[][] matrix = new int[row][col];
         populateMatrix(matrix);
 
         int[][] sumMatrix = calculateSumMatrix(matrix, false);
 
         displayMatrix("Original", matrix);
         displayMatrix("Square Matrix", matrix);
         displayMatrix("Sum Matrix", sumMatrix);
     }
 
     // Handles diagonal matrix processing
     public static void processDiagonalMatrix() {
         int row = getMatrixSize("rows");
         int col = getMatrixSize("columns");
         if (!validMatrix(row, col)) return;
 
         int[][] matrix = new int[row][col];
         populateMatrix(matrix);
 
         int[][] diagonalMatrix = getDiagonalMatrix(matrix);
         int[][] sumMatrix = calculateSumMatrix(matrix, true);
 
         displayMatrix("Original Matrix", matrix);
         displayMatrix("Diagonal Matrix", diagonalMatrix);
         displayMatrix("Sum Matrix", sumMatrix);
     }
 
     // Displays a matrix with a title
     public static void displayMatrix(String title, int[][] matrix) {
         System.out.println("\n" + title);
         for (int[] row : matrix) {
             for (int value : row) {
                 System.out.print(value + "\t");
             }
             System.out.println();
         }
     }
 }
 