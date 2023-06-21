package DataStructure.Search;
import algorithms_2019_024.*;
import java.util.*;


public class LinearSearch {
    Scanner s = new Scanner(System.in);
    public void Linear_Search(){
        System.out.println("============== Linear Search ==============");
        Input in = new Input();
        int arr[] = in.input_value();
        int size = arr.length;
        System.out.print("Enter the key value: ");
        int key_value = s.nextInt();
        boolean found = false;
        int i;
        for(i=0;i<size;i++){
            if(key_value==arr[i]){
               found = true;
               break;
            }
        }
        
        if(found){
            System.out.println("Key value is found at index "+i);
        }else{
            System.out.println("Key value is not found !");
        }
        System.out.println("\n************************************************");   
    }
}
