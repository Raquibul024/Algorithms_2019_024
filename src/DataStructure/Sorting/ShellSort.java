package DataStructure.Sorting;

import algorithms_2019_024.*;


public class ShellSort {
    public void Shell_Sort(){
        System.out.println("============== Shell Sort ==============");
        Input in = new Input();
        Output out = new Output();
        int arr[] = in.input_value();
        int n = arr.length;
        for(int gap = n/2;gap>0;gap/=2){
            for(int i=gap;i<n;i++){
                int temp = arr[i];
                int j;
                for(j=i;j>=gap && arr[j-gap]>temp;j-=gap){
                    arr[j]=arr[j-gap];
                }
                arr[j]=temp;
            }
        }
        out.sortedArray(arr);
    }
}
