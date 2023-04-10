/*
 * Sliding Window
 * 53. Maximum Subarray
 */

public class MaxSumSubarray {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=0 && sum<0){
                sum=0;
            }
            else{
                if(sum<0)
                    sum=Math.max(sum,nums[i]);
                maxSum=Math.max(sum,maxSum);
            }
            sum+=nums[i];
        }
        return Math.max(sum,maxSum);
    }
}