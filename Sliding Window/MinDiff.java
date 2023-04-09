/*
 * Problem 1984 - Sliding window
 * Minimum Difference Between Highest and Lowest of K Scores
 */

import java.util.Arrays;

public class MinDiff {
    public int minimumDifference(int[] nums, int k) {
        int ans=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0; i+k-1<nums.length; i++){
            if(nums[i+k-1]-nums[i]<ans)
                ans=nums[i+k-1]-nums[i];
        }
        return ans;
    }
}
