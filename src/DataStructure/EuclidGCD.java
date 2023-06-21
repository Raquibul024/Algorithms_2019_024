package DataStructure;
import java.util.*;


public class EuclidGCD {
    Scanner s = new Scanner(System.in);
   public void Euclid_GCD(){
        System.out.println("============== Euclidean GCD ==============");
        System.out.println("Enter two numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is "+a);
    }
}
