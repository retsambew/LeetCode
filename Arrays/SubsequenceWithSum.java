/*
 * 1498. Number of Subsequences That Satisfy the Given Sum Condition
 * Daily Problem - 6th may 2023
 */

public class SubsequenceWithSum {
    public int numSubseq(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int ans = 0;
        int mod = 1000000007;
        int[] pows = new int[nums.length];
        pows[0] = 1;
        for (int k = 1; k < nums.length; ++k)
            pows[k] = pows[k - 1] * 2 % mod;
        Arrays.sort(nums);
        while (i <= j) {
            if (nums[i] + nums[j] <= target) {
                ans = (ans + pows[j - i]) % mod;
                i++;
            } else
                j--;
        }
        return ans;
    }
}
