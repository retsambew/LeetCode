/*
 * 215. Kth Largest Element in an Array
 */

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
            if (minHeap.size() > k)
                minHeap.poll();
        }
        return minHeap.peek();
    }
}
