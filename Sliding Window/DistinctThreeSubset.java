/*
 * 1876. Substrings of Size Three with Distinct Characters
 * Link https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
 */

class Solution {
    public int countGoodSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length()-2;i++){
            if(!(s.charAt(i)==s.charAt(i+1) || s.charAt(i) == s.charAt(i+2) || s.charAt(i+1) == s.charAt(i+2)))
                ans++;
        }
        return ans;
    }

    // 
    // public int countGoodSubstrings(String s) {
    //     int ans=0;
    //     for(int i=0;i<s.length()-2;i++){
    //         Set<Character> set=new HashSet<Character>();
    //         for(int j=i;j<i+3;j++){
    //             if(!set.add(s.charAt(j)))
    //                 break;
    //         }
    //         if(set.size()==3)
    //             ans++;
    //     }
    //     return ans;
    // }
}