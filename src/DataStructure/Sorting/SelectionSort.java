package DataStructure.Sorting;

import algorithms_2019_024.Input;
import algorithms_2019_024.Output;


public class SelectionSort {
    public void Selection_Sort(){
        System.out.println("============== Selection Sort ==============");
        Input in = new Input();
        Output out = new Output();
        int arr[] = in.input_value();
        int min,temp,i,j,len=arr.length,pass=1;
        for(i=0;i<len-1;i++){
            min = i;
            for(j=i+1;j<len;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            System.out.print("Pass "+pass+" => ");
            for(int k=0;k<len;k++){
                System.out.print(arr[k]+" ");
            }
            pass++;
            System.out.println("");
        }
        out.sortedArray(arr);
    }
}
