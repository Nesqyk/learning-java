public class Sorting {

    public int[] bubbleSort(int[] arr) {
        int n  = arr.length;
        for(int i = 0 ; i < n - 1; i++) {
            for(int j = 0; i < n - i - 1; j++) {
                if(arr[j] < arr[j +1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                
            }
        }
        return arr;
    } 

    public int[] insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int temp = arr[i];
            int j  = i - 1;

            while(j >= 0 && arr[j] > arr[j + 1]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public int[] selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            if(min != i) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[min] = temp;
            }
        }
        return arr;
    }

    public int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length + 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
}
