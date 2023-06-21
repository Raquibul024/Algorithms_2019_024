package DataStructure.Sorting;

import algorithms_2019_024.Input;
import algorithms_2019_024.Output;


public class CountingSort {
    public void Count_Sort(){
        System.out.println("============== Counting Sort ==============");
         Input in = new Input();
         Output out = new Output();
        int arr[] = in.input_value();
        int size = arr.length;
        int output[] = new int[size];
        // find max value
        int max = arr[0];
        for(int i =1;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        // create count array to store the count of each element
        int count[] = new int[max+1];
        for(int j=0;j<size;j++){
            count[arr[j]]++;
        }
        // cumulitive sum that indicate the position of each element
        for(int j=1;j<=max;j++){
            count[j]+=count[j-1];
        }
        // sort and store output array
        for(int i=size-1;i>=0;i--){
            count[arr[i]]--;
            output[count[arr[i]]] = arr[i];
        }
        
        // copy sorted array to the orginal array
        for(int j=0;j<size;j++){
            arr[j]=output[j];
        }
        
        out.sortedArray(arr);
    }
}
