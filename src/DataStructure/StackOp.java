package DataStructure;
import java.util.*;

public class StackOp {
    Scanner s = new Scanner(System.in);
    public void stack(){
        System.out.println("============== Stack Operation ==============");
        Stack<Integer> st = new Stack<Integer>();
        System.out.println(
                "Enter operation: \n1. Push \n2. Pop \n3. Peek \n4. Print \n5. IsEmpty \n6. Size \n7. Search \n8. Exit");
        
        while(true){
            System.out.println("Choice: ");
            int c = s.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Enter size: ");
                    int n = s.nextInt();

                    System.out.println("Enter elements: ");
                    for (int i = 0; i < n; i++) {
                        st.push(s.nextInt());
                    }
                    break;
                case 2:
                    System.out.println("Popped item: " + st.pop());
                    break;
                case 3:
                    System.out.println("Element on top is: " + st.peek());
                    break;
                case 4:
                    System.out.println("Stack elements are: " + st);
                    break;
                case 5:
                    if (st.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 6:
                    System.out.println("Stack Size: " + st.size());
                    break;
                case 7:
                    System.out.print("Enter the key you want to search: ");
                    int res = st.search(s.nextInt());
                    if (res == -1) {
                        System.out.println("Item not found in stack");
                    } else {
                        System.out.println("Item position(From top): " + res);
                    }
                    break;
                case 8:
                    return;
        }
    }
}
}
