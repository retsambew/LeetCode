/*
 * 27. Remove Element
 * Two Pointer Approach
 * My Explanation - https://leetcode.com/problems/remove-element/solutions/3415830/java-solution-with-explanation-and-common-errors/
 */

public class RemoveDuplicate {
    public int removeElement(int[] nums, int val) {
        int count = nums.length-1;
        for(int i=0;i<=count;i++){
            if(nums[i]==val){
                nums[i--]=nums[count--];
            }
        }
        return count+1;
    }
}
