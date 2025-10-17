import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftMatrix {

    public static void main(String[] args) {
        int[][] arr = {{1,9,3}, {8,5,6}};

        System.out.println(lowestScore(arr));
        

        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(sumRows(arr)[i]);
        }

        System.out.println(indexLargestElement(new int[]{1,2,3,6,5}));
        System.out.println(findLargestIndex(arr));
    }

    // public int[][] shiftGrid(int[][] grid, int k) {
    //     // shift the element of grid to k times.

    //     int[][] shifted = new int[grid.length][grid[0].length];
        
    //     for (int i = 0; i < grid.length; i++) {
    //         for (int j = 0; j < grid[i].length; j++) {
    //             // elemet at grid[i][j] moves to grid[i][j + 1]
    //             // grid[i][n-1] moves to grid[i + 1][0]
    //             // grid[i-1][j-1] [grid][0][0]
    //             if(i == j) {
                     
    //             }
    //         }
    //     }
    // }

    static int lowestScore(int[][] arr) {

        int lowestMax = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < lowestMax) {
                    lowestMax = arr[i][j];
                }                
            }
        }
        return lowestMax;
    }

    static int[] sumRows(int[][] arr) {

        int[] sum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum[i] += arr[i][j];
            }
        }
        return sum;
    }

    public static int indexLargestElement(int[] list)
    {
        int largestIndex = 0;
        int max = 0;
        for(int i = 0 ; i < list.length; i++)
        {
            if(list[i] > max)
            {
                max = list[i];
                largestIndex = i;
            }
        }
        return largestIndex;
    }

    public static int findLargestIndex(int[][] list) {
        int largest = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if(list[i][j] > largest) {
                    largest = list[i][j];
                }
            }
        }
        return largest;
    }


    // to find which row has the highest sum 
    // we need to iniiilaize first the max column
    // then
    // for i < n
    // intiailize here the current sum
    // for j < arr[i].length
    // then add first the cunrrect sum
    // then compare if currentSum > highestSum 
    // highestSum  = currentSum
    // indexHighestSum = row;
}
