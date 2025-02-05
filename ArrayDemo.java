/*
 * What is an array?
 * 
 */

public class ArrayDemo {

    // each item in an array is called element
    // and ech element is accessed by its index
    public static void main(String[] args) 
    {

        int[] arrayInt;

        arrayInt = new int[10];

        for(int i = 0 ; i < arrayInt.length; i++)
        {
            arrayInt[i] = i;
            System.err.print(arrayInt[i] + " ");
        }
    }
}
