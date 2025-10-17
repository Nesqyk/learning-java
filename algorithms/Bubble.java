public class Bubble {
    

    public static void main(String[] args) {

        int[] arr = {18, 20, 2, 30};

        // for i = 0 to n-1
        //  for j = 0 to n-i-1;
        //      if arr[j] < arr[j + 1] 
        //          swap(arr[j], arr[j + 1])
        
        for(int i = 0; i < arr.length - 1; i++) 
        {
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] =  arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
