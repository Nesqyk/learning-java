public class Selection {


    public static void main(String[] args) {

        int[] arr = {18,20,2,30};

        // Selection Sort
        
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            
            if (min_idx != i) {
                // Proper swap
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
    }

    
}
