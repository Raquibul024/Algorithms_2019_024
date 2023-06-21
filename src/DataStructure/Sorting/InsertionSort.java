package DataStructure.Sorting;

import algorithms_2019_024.Input;
import algorithms_2019_024.Output;


public class InsertionSort {
    public void Insertion_Sort(){
        System.out.println("============== Insertion Sort ==============");
        Input in = new Input();
        Output out = new Output();
        int arr[] = in.input_value();
        int len = arr.length;
        for(int i=1;i<len;i++){
            int j=i-1;
            int current = arr[i];
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
            System.out.println("Pass->"+i);
            for(int k=0;k<len;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println("");
        }

        out.sortedArray(arr);
    }
}
