/*
 * 6. Zigzag Conversion
 */

public class Zigzag {
    public String convert(String s, int numRows) {
        String ar[] = new String[numRows];
        String ans = "";

        for (int i = 0; i < numRows; i++)
            ar[i] = "";

        int i = 0;
        while (i < s.length()) {
            for (int j = 0; j < numRows && i < s.length(); j++, i++)
                ar[j] += s.charAt(i);
            for (int j = numRows - 2; j > 0 && i < s.length(); j--, i++)
                ar[j] += s.charAt(i);
        }

        for (i = 0; i < numRows; i++)
            ans += ar[i];

        return ans;
    }
}
