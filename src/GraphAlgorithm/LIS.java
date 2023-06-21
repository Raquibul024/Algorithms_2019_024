package GraphAlgorithm;
import algorithms_2019_024.*;
import java.util.*;

public class LIS {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLIS = 0;
        for (int i = 0; i < n; i++) {
            maxLIS = Math.max(maxLIS, dp[i]);
        }

        return maxLIS;
    }
    
    public void run(){
        System.out.println("\u001B[34m============== Longest Increasing Subsequence ==============\u001B[0m");
        Input in = new Input();
        LIS lis = new LIS();
        int arr[] = in.input_value();
        int len = lis.lengthOfLIS(arr);
        System.out.println("\u001B[34mLength of LIS is: \u001B[0m" + len);
    }

}
