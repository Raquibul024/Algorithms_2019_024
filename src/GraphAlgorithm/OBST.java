package GraphAlgorithm;

import java.util.Scanner;


public class OBST {
     static int optimalBST(int freq[], int i, int j) {
        if (j < i)
            return 0;
        if (j == i)
            return freq[i];

        int fsum = sum(freq, i, j);

        int min = Integer.MAX_VALUE;

        for (int r = i; r <= j; ++r) {
            int cost = optimalBST(freq, i, r - 1) +
                    optimalBST(freq, r + 1, j);
            if (cost < min)
                min = cost;
        }

        return min + fsum;
    }

    static int optimalSearchTree(int keys[], int freq[], int n) {
        return optimalBST(freq, 0, n - 1);
    }

    // A utility function to get sum of array elements
    // freq[i] to freq[j]
    static int sum(int freq[], int i, int j) {
        int s = 0;
        for (int k = i; k <= j; k++)
            s += freq[k];
        return s;
    }

    public void run() {
        Scanner s = new Scanner(System.in);
    System.out.println("\u001B[34m============== Optimal Binary Search Tree ==============\u001B[0m");
    System.out.print("Enter the number of keys: ");
    int n = s.nextInt();

    int[] keys = new int[n];
    int[] freq = new int[n];

    System.out.println("Enter the keys:");
    for (int i = 0; i < n; i++) {
        keys[i] = s.nextInt();
    }

    System.out.println("Enter the frequencies:");
    for (int i = 0; i < n; i++) {
        freq[i] = s.nextInt();
    }
        System.out.print("Given keys: ");
        for (int keys2 = 0; keys2 < keys.length; keys2++) {
            System.out.print(keys[keys2] + " ");
        }
        System.out.print("\nGiven frequencies: ");
        for (int freq2 = 0; freq2 < freq.length; freq2++) {
            System.out.print(freq[freq2] + " ");
        }
        System.out.println("\n\n\u001B[34mOptimal BST cost is: \u001B[0m" +
                optimalSearchTree(keys, freq, n));
    }
}
