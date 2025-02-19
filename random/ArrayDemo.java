package random;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {

    // each item in an array is called an element
    // and each element is accessed by its index
    public static void main(String[] args) 
    {

        // int[] arrayInt;

        // arrayInt = new int[10];

        // for(int i = 0 ; i < arrayInt.length; i++)
        // {
        //     arrayInt[i] = i;
        //     System.out.print(arrayInt[i] + " ");
        // }
        // double[] numArr = {12.50,8.35,19.60,25.00};

        // findLargestNum(numArr);
        // process2dArray();
        // int i = Integer.parseInt("+782");
        // foreachDemo();

        // ArrayOutOfBoundsExample();

        // comparing two arrays;

        // int[] arr1 = {1,23,4,5,6};
        // int[] arr2 = {2,4,5,6,7};


        // int[] listA = {1, 2, 3};
        // int[] listB = {1, 2, 3};

        // System.out.println(listA == listB); // false (different memory locations)

        // int[] listC = listA;
        // System.out.println(listA == listC); // true (same reference)


        // 1. Declaring a variable
        double num1 = largest(32,56);
        double num2 = largest(12.56, 84, 92);
        double num3 = largest(98.32,77,64.67,56);

        // 2. Direct calling of the function
        System.err.println("NUM 1 : " + num1 +"\nNUM 2 : " + num2 + "\nNUM 3 : " + num3 + "\n");
        System.out.println(largest(22.50, 67.78,92.5,45,34,56));

        // 3. Declare a list
        double numberList[] = {1,2,3,4,5,6,7};

        System.out.println(largest(numberList));
    }

    boolean areEqualArrays(int[] firstArray, int[] secondArray)
    {
        if (firstArray.length != secondArray.length)
            return false;

        for (int index = 0; index < firstArray.length; 
                            index++)
            if (firstArray[index] != secondArray[index])
                return false;   
        return true;
    }

    // static boolean comparingArrays()
    // {
    //     int[] arrayOne = {1,2,3,4,5};
    //     int[] arrayTwo = {2,5,6,7,8};

    //     // Method 1: .equal(Arr) method.

    //     if(arrayOne.equals(arrayTwo)) {
    //         return false;
    //     }

    //     // Method 2: Iterating each index;

    //     for(int i = 0 ; i < arrayOne.length; i++) {
    //         if(arrayOne[i] == arrayTwo[i]) {
    //             return false;
    //         }
    //     }
    // }
    
    static void findLargestNum(double[] numbers)
    {
        if (numbers.length == 0) {
            JOptionPane.showMessageDialog(null, "Array is empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int maxIndex = 0;
        double largestNum = numbers[0]; // Initialize with first element

        System.out.println("Initial Array: " + Arrays.toString(numbers));

        for (int i = 1; i < numbers.length; i++) { // Start from index 1
            System.out.printf("Comparing: %.2f (current max) vs %.2f (new)\n", largestNum, numbers[i]);

            if (largestNum < numbers[i]) {
                maxIndex = i;
                largestNum = numbers[i];
                System.out.printf("Updated Max: %.2f at index %d\n", largestNum, maxIndex);
            }
        }

        // Debugging statement for Visualizer
        System.out.println("Final Largest Number: " + largestNum);
        JOptionPane.showMessageDialog(null,"Current Temperature: 70 degrees", "Temperature",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Largest Number is " + largestNum, "Largest Number", JOptionPane.INFORMATION_MESSAGE);
    }

    static void process2dArray()
    {
        int[][] numbers = new int[5][5];
        Scanner s = new Scanner(System.in);
        
        for(int i = 0 ; i  < numbers.length; i++) 
        {
            System.out.printf("Please enter Values for Row : #%d:\n", i + 1);
            for(int j = 0; j < numbers[i].length; j++) 
            {
                numbers[i][j] = s.nextInt();
            }
        }
        s.close();

        // print the stuffs

        for(int i = 0 ;  i < numbers. length; i++)
        {
            System.out.printf("Row : #%d\n", i + 1);
            for(int j = 0 ; j < numbers[i].length; j++)
            {
                System.out.printf("%d ", numbers[i][j]);
            }
            System.out.println();
        }
    }

    static void foreachDemo()
    {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i : numbers) {
            System.out.printf("%d ", i);
        }
    }

    /*
     * Reason to use this is: its size can be dynamic.
     */
    static void arrayListDemo()
    {
        ArrayList<Integer> listN = new ArrayList<>();

        listN.add(1);
        listN.add(2);
        listN.add(3);

        // Set a breakpoint here to inspect listN before removal
        System.out.println("Before removal");

        listN.remove(0);  // Removes element at index 0 (1)

        // Set another breakpoint here to inspect after first removal
        System.out.println("After first removal");

        listN.removeAll(listN);  // Removes all elements

        // Set another breakpoint to inspect after clearing
        System.out.println("After clearing");

        if (listN.isEmpty()) {
            System.err.println("ArrayList is empty!");
        }

        for (Integer integer : listN) {
            System.err.printf("%d ", integer);
        }
    }


    static void process1dArray()
    {
        int[] list = new int[10];	
        int i;

        Scanner console = new Scanner(System.in);

        for (i = 0; i < list.length; i++) 
        {
            list[i] = console.nextInt(); 
        }
        for (i = 0; i < list.length; i++) 
        {
            System.out.print(list[i] + " "); 
        }

        console.close();
    }


    
    static void ArrayOutOfBoundsExample() {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array: " + Arrays.toString(numbers));

        // Correct indexing (0 to 4)
        System.out.println("Element at index 2: " + numbers[2]);

        // Out-of-bounds access (Index 5 does not exist)
        System.out.println("Element at index 5: " + numbers[5]); // Error occurs here
    }
    

    public static void fillArray(int[] list, int numOfElements) 
    {
        Scanner s = new Scanner(System.in);
        for(int i = 0 ; i < numOfElements; i ++)
        {
            list[i] = s.nextInt(); 
        }
        s.close();
    }

    public static void printArray(int[] list, int numbeOfElements)
    {
        for(int i = 0 ; i < numbeOfElements; i++)
        {
            System.err.println(list[i] + " ");
        }
    }

    public static int sumArray(int[] list)
    {
        int sum = 0;

        for(int i = 0 ;  i < list.length; i++)
        {
            sum += list[i];
        }
        return sum;
    }

    public static int indexLargestElement(int[] list)
    {
        int maxIndex = 0;

        for(int i = 0 ;  i < list.length; i++)
        {
            if(list[maxIndex] < list[i])
            {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // ! Reminder:
    // ? arrayOne's size must equal to arrayTwo
    // ? else it will result to ArrayOutOfBound.
    public static void copyArray(int[] arrayOne, int[] arrayTwo)
    {
        for(int i = 0; i < arrayOne.length; i++)
        {
            arrayTwo[i] = arrayOne[i];
        }
    }

    public static int seqSearch(int[] list, int searchItem) {
        int location = 0; // Start from the first element
        boolean found = false; // Track if the item is found
    
        // Loop through the array until found or reach the end
        while (location < list.length && !found) {
            if (list[location] == searchItem) {
                found = true; // Item is found
            } else {
                location++; // Move to the next index
            }
        }
    
        // If found, return the index; if not, return -1
        return found ? location : -1;
    }

    // A method that returns the largest value from a list of double values.

    public static double largest(double ... list)
    {
        double max = 0.0;
        int arraySize = list.length;

        if(arraySize != 0)
        {
            for(int i = 0 ; i < arraySize; i ++)
            {
                if(max < list[i])
                {
                    max = list[i];
                }
            }    
        }
        return max;
    }

    

}
