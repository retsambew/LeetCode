/**
 * 416. Partition Equal Subset Sum
 */

public class PartitionSum {
    boolean dp[][];

    public boolean subsetSum(int[] nums, int w, int n) {
        dp = new boolean[n + 1][w + 1];
        // initialising DP
        for (int i = 0; i <= w; i++)
            dp[0][i] = false;
        for (int i = 0; i <= n; i++)
            dp[i][0] = true;

        // Filling DP
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (nums[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][w];
    }

    public boolean canPartition(int[] nums) {
        int sum = 0, n = nums.length;
        for (int i = 0; i < n; i++)
            sum += nums[i];
        if (sum % 2 == 0)
            return subsetSum(nums, sum / 2, n);
        return false;
    }
}