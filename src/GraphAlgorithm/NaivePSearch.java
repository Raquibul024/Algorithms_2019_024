package GraphAlgorithm;

import java.util.Scanner;


public class NaivePSearch {
    public void search(String pat, String txt) {
        int pLen = pat.length();
        int tLen = txt.length();
        int i = 0, j = tLen - 1;

        for (i = 0, j = tLen - 1; j < pLen;) {

            if (txt.equals(pat.substring(i, j + 1))) {
                System.out.println("\u001B[34mPattern found at index: \u001B[0m" + i);
            }
            i++;
            j++;
        }
    }

    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.println("\u001B[34m============== Naive Pattern Search ==============\u001B[0m");
        System.out.print("Enter the pattern: ");
        String pat = s.nextLine();

        System.out.print("Enter the text: ");
        String txt = s.nextLine();
        
        // Function call
        search(pat, txt);
    }
}
