package DataStructure.Sorting;

import java.util.Scanner;


public class Fibonacci {
    
    public void fibonacci(){
        Scanner s = new Scanner(System.in);
        System.out.println("============== Fibonacci Series ==============");
        int a = 0, b = 1,c,r;
        System.out.print("Enter the range: ");
        r = s.nextInt();
        for(int i=1;i<=r;i++){
            System.out.print(a+", ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("");
        System.out.println("");
               
        
    }
}
