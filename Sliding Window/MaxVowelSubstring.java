/*
 * 1456. Maximum Number of Vowels in a Substring of Given Length
 */

public class MaxVowelSubstring {
    public int maxVowels(String s, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        int maxCount = count;
        for (int i = k; i < s.length(); i++) {
            char ch = s.charAt(i - k);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count--;
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
                if (maxCount < count)
                    maxCount = count;
            }
        }
        return maxCount;
    }
}
