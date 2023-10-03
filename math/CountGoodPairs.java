/*
 * 1512. Number of Good Pairs
 * Daily Problem - 10th Oct'23
 */

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;

        // filling the map to know count of number of occurences of elements.
        for(int i: nums)
            map.put(i, map.getOrDefault(i,0)+1);

        // using the formula to calculate total number of pairs per unique element.
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            int n = e.getValue() - 1;
            ans+=((n*(n+1))/2); // sum of n natural numbers
        }
        return ans;
    }
}