/*
 * 347. Top K Frequent Elements
 */

public class KFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int num : map.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k)
                minHeap.poll();
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = minHeap.poll();
        }
        return ans;
    }
}
