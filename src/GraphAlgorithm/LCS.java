package GraphAlgorithm;
import java.util.Scanner;


public class LCS {
    int lcs(char[] X, char[] Y, int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        if (X[m - 1] == Y[n - 1])
            return 1 + lcs(X, Y, m - 1, n - 1);
        else
            return max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n));
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.println("\u001B[34m============== Longest Common Subsequence ==============\u001B[0m");
        System.out.print("Enter the first string: ");
        String s1 = s.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = s.nextLine();

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Given strings are S1: " + s1 + "\t S2: " + s2);
        System.out.println("\u001B[34mLength of LCS is \u001B[0m" + lcs(X, Y, m, n));

    }

}
