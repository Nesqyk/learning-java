package practice;

import java.util.Scanner;

public class Traversal {
    
    // find sum of all elements of a 2d array

    public static void main(String[] args) {
        int[][] arr  = {{1,2,3,4},{2,3,4,5}};

        int[][] transposedMatrix = transposeMatrix(arr);

        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j]);
            }
            System.out.println();
        }

        System.out.println(isSymmetrixMatrix(arr));
    }

    // public int[][] populateMatrix() {
    //     Scanner s = new Scanner(System.in);
    //     int[][] matrix = new int[3][3];
    //     for (int row = 0; row < matrix.length; row++) {
    //         for (int col = 0; col < matrix[row].length; col++) {
    //             System.out.print("Enter value for Row " + (row + 1) + " Column " + (col + 1));
    //             matrix[row][col] = s.nextInt();
    //         }
    //         System.out.println();
    //     }
    // }


    static int calculateSum(int[][] arr, boolean variation) {
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {

                if(variation) {
                    if(arr[row][col] % 2 == 0) {
                        sum += arr[row][col];
                    } else {
                        sum += arr[row][col];
                    }
                } else {
                    sum += arr[row][col];
                }
                
            }
        }
        return sum;
    }

    // find row which has the highest sum 

    static int highestIndexSum(int[][] arr) {
        int maxSum = 0;
        int highestRow = 0;

        for (int row = 0; row < arr.length; row++) {

            int currentRowSum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                currentRowSum += arr[row][col];
            }
            if(currentRowSum > maxSum) {
                maxSum = currentRowSum;
                highestRow = row;
            }
        }
        return highestRow;
    }

    static int highestIndex(int[][] arr) {
        int highIndex = 0;
        int baseValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > baseValue) {
                    baseValue = arr[i][j];
                    highIndex = j;
                }
            }
        }
        return highIndex;
    }
    static int[][] transposeMatrix(int[][] arr) {
        
        int[][] transposed = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transposed[j][i] = arr[i][j];
            }   
        }
        return transposed;
    }

    static boolean isSymmetrixMatrix(int[][] arr) {
        for(int i = 0 ; i < arr.length; i++) {
            for(int j = i + 1 ; j < arr.length; j++) {
                if(arr[j][i] != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    static void printBoundaryElement(int[][] arr) {
        if(arr.length != 0 && arr.length == arr[0].length) return;


    }
}
