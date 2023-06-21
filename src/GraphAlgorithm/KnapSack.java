package GraphAlgorithm;

import java.util.Scanner;


public class KnapSack {
    public int Knap_Sack(int[] values, int[] weights, int capacity) {
        int n = values.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.println("\u001B[34m============== (0,1) Knapsack ==============\u001B[0m");
        System.out.print("Enter the number of items: ");
        int n = s.nextInt();

        int[] values = new int[n];
        int[] weights = new int[n];

        System.out.println("Enter the values of the items:");
        for (int i = 0; i < n; i++) {
            values[i] = s.nextInt();
        }

        System.out.println("Enter the weights of the items:");
        for (int i = 0; i < n; i++) {
            weights[i] = s.nextInt();
        }

        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = s.nextInt();

        int maxProfit = Knap_Sack(values, weights, capacity);
        System.out.print("\u001B[34mMaximum profit is: \u001B[0m"+maxProfit);
        System.out.println("");
    }
}
