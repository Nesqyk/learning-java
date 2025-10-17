public class Insertion {
    

    public static void main(String[] args) {

        

        // the idea of insertion short it get inserted from 
        // left to right
        // so if i is less than j 
        // then i becomes
        int[] arr = {18, 20, 2, 30};


        // for i : 1 to n
        //  key = arr[i]
        //  j = i  - 1
        //      while j >= 0 and arr[j] > key
        //      arr[j + 1] = arr[j]
        //      j--
        //  arr[j+1] = key
        

        // for i : 1 to n
        //  key : arr[i]
        //  j : i - 1 <- going left
        //      while j >= 0 && arr[j] > key
        //      arr[j + 1] = arr[j]
        //      j--
        //  arr[j + 1] = key

        for(int i = 1; i < arr.length; i++) {
            int key = arr[i]; // store a temp varible first for comparison later
            int j = i - 1; // shift to left n-1

            // will only stop if its false
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; 
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
}
