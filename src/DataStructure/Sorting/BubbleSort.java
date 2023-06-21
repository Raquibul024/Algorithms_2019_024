package DataStructure.Sorting;

import algorithms_2019_024.Input;
import algorithms_2019_024.Output;
import java.util.Scanner;


public class BubbleSort {
    Scanner s = new Scanner(System.in);
    Input in = new Input();
    Output out = new Output();
    public void bubble_sort(){
        System.out.println("============== Bubble Sort ==============");
        Input in = new Input();
        int arr[] = in.input_value();
        int size = arr.length;
        for(int i=0;i<size;i++){
            int pass = i+1;
            if(pass<size){
                System.out.println("after pass-> "+pass);
            }
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;  
                    
                    for( int k=0;k<size;k++){
            System.out.print(arr[k]+" ");
        }
            }else{
                    for( int k=0;k<size;k++){
            System.out.print(arr[k]+" ");
        }
                }
            System.out.println();
            }
        }  
        out.sortedArray(arr);
    }
}
