package DataStructure.Sorting;
import algorithms_2019_024.*;


public class HeapSort {
    public void Heap_Sort(){
        System.out.println("\u001B[34m============== Heap Sort ==============\u001B[0m");
        Input in = new Input();
        Output out = new Output();
        int arr[] = in.input_value();
        int len = arr.length;
        for (int i = len / 2 - 1; i >= 0; i--)
            heapify(arr, len, i);
        
        for (int i = len - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
        heapify(arr, i, 0);           
        }       
            out.sortedArray(arr);
    }
    
    void heapify(int arr[], int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest])
            largest = l;

        if (r < N && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, N, largest);
        }
    }
}
