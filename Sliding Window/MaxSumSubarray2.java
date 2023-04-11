import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
 * Problem 2461 - Sliding Window
 * Maximum Sum of Distinct Subarrays With Length K
 */

public class MaxSumSubarray2 {
    public long maximumSubarraySum(int[] nums, int k) {
        LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
        long maxSum=0;
        long sum=0;
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){
                int dup=new ArrayList<Integer>(set).indexOf(nums[i]);
                for (int j = i-k+1; j <= i-k+1+dup; j++) {
                    if(j>=0){
                        set.remove(nums[j]);
                        sum-=nums[j];
                    }
                }
                set.add(nums[i]);
            }
            else{
                sum+=nums[i];
            }
            // System.out.println(i+set.toString()+sum);
            if(set.size()==k){
                if(sum>maxSum)
                    maxSum=sum;
                set.remove(nums[i-k+1]);
                sum-=nums[i-k+1];
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] ar={1,5,1,7,8,8,4,5,6,7,8,9,9,2,3,4,5,6,7,8,9,3};
        long a=new MaxSumSubarray2().maximumSubarraySum(ar, 6);
        System.out.println(a);
    }
}