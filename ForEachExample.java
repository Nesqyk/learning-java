public class ForEachExample {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};

        for (int num : numbers) {
            System.out.println(num);

            // int[][] array = {
            //     {5, 3, 7},
            //     {2, 6, 4},
            //     {8, 1, 9}
            // };
            
            // System.out.println(array[0][1]); // Output: 3 (row 0, column 1)
        }
    }
}
