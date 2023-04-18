/*
 * 1768. Merge Strings Alternately
 * LeetCode Daily - 18th april '23
 */

public class MergeAlt {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int i = 0, j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                ans += word1.charAt(i++);
            }
            if (j < word2.length()) {
                ans += word2.charAt(j++);
            }
        }
        return ans;
    }
}