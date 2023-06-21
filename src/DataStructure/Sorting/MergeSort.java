package DataStructure.Sorting;
import algorithms_2019_024.*;
import java.util.*;

public class MergeSort {
    public void Merge_Sort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        Merge_Sort(left);
        Merge_Sort(right);

        merge(arr, left, right);
    }

    public void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public void run() {
    System.out.println("\u001B[34m============== Merge Sort ==============\u001B[0m");
        Input in = new Input();
        Output out = new Output();
        int arr[] = in.input_value();
        Merge_Sort(arr);
        out.sortedArray(arr);
  }
}
