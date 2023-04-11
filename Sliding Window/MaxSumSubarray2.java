/*
 * Problem 2461 - Sliding Window
 * Maximum Sum of Distinct Subarrays With Length K
 */

public class MaxSumSubarray2 {
    public long maximumSubarraySum(int[] nums, int k) {
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
    }
}