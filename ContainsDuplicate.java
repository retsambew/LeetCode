import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                return true;
            }
            map.put(i,0);
        }
        return false;
    }
}