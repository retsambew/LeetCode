import java.util.Arrays;

public class SearchInsertPoint {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1)
            return nums[0] >= target ? 0 : 1;
        int i = nums.length / 2;
        if (nums[i] == target)
            return i;
        if (nums[i] > target && nums[i - 1] < target)
            return i;
        if (nums[i] > target)
            return searchInsert(Arrays.copyOfRange(nums, i + 1, nums.length), target);
        return searchInsert(Arrays.copyOfRange(nums, 0, i), target);
    }
}
