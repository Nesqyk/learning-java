import javax.swing.JOptionPane;

public class ArrayDemo {

    // each item in an array is called element
    // and ech element is accessed by its index
    public static void main(String[] args) 
    {

        // int[] arrayInt;

        // arrayInt = new int[10];

        // for(int i = 0 ; i < arrayInt.length; i++)
        // {
        //     arrayInt[i] = i;
        //     System.out.print(arrayInt[i] + " ");
        // }
        int[] numArr = {1,2,3,4,2};

        findLargestNum(numArr);
    }

    static void findLargestNum(int[] numbers)
    {
        int maxIndex = 0;
        int largestNum = 0;
        for(int i = 0 ; i < numbers.length; i++)
        {
            if (numbers[maxIndex] < numbers[i])
            {
                System.out.printf("%d %d \n", numbers[maxIndex] , numbers[i]);
                maxIndex = i;
            }
            largestNum = numbers[maxIndex];
        }
        JOptionPane.showMessageDialog(null, "Largest Number is " + largestNum, "Largest Number", JOptionPane.INFORMATION_MESSAGE);

    }
}
