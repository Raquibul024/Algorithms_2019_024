package DataStructure.Sorting;
import algorithms_2019_024.*;


public class QuickSort {
    public void Quick_Sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            // Recursively sort elements before and after the pivot
            Quick_Sort(arr, low, pivotIndex - 1);
            Quick_Sort(arr, pivotIndex + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    
    public void run() {
        System.out.println("\u001B[34m============== Quick Sort ==============\u001B[0m");
        Input in = new Input();
        Output out = new Output();
        int arr[] = in.input_value();
        int len = arr.length;        
        Quick_Sort(arr, 0, len - 1);
        out.sortedArray(arr);
    }
}
