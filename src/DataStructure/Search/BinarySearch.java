package DataStructure.Search;
import algorithms_2019_024.*;
import java.util.*;

public class BinarySearch {
    Scanner s = new Scanner(System.in);
    public void Binary_Search(){
        System.out.println("============== Binary Search ==============");
        Input in = new Input();
        Output out = new Output();
        int arr[] = in.input_value();
        Arrays.sort(arr);
        out.sortedArray(arr);
        int size = arr.length;
        int low = 0,pos=-1;
        int high = size - 1;
        System.out.print("Enter the key value: ");
        int key_value = s.nextInt();
        boolean found = false;
        while(low<=high){
             int mid = (low+high)/2;
            if(arr[mid]==key_value){
                found = true;
                pos = mid;
                break;
            }else if(arr[mid] > key_value){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        
        if(found){
            System.out.println("Key value is found at index "+pos);
        }else{
            System.out.println("Key value is not found !");
        }
        System.out.println("\n************************************************");
    }
}
