/*
 * 1672. Richest Customer Wealth
 */

public class MaxWealth {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0, sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[0].length; j++)
                sum += accounts[i][j];
            if (sum > maxSum)
                maxSum = sum;
        }
        return maxSum;
    }
}