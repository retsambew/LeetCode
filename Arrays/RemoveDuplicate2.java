/*
 * 26. Remove Duplicates from Sorted Array
 */

public class RemoveDuplicate2 {
    public int removeDuplicates(int[] nums) {
        int p = 1;
        int size = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                size--;
                continue;
            }
            nums[p++] = nums[i];
        }
        return size;
    }
}
