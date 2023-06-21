package DataStructure;

import java.util.*;


public class Recurrence {
    public int fact(int num){
        if(num > 0)
            return num * fact(num -1);
        else
            return 1;
    }
    
    public void recur(){
        System.out.println("============== Recurrence ==============");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int res = fact(n);
        System.out.println("The factorial value of "+n+" using recurrence is: "+res);
    }
}
