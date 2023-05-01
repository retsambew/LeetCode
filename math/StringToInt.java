/*
 * 8. String to Integer (atoi)
 */

public class StringToInt {
    public int myAtoi(String s) {
        int i = 0;
        long num = 0;
        boolean isNeg = false;
        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        if (i == s.length())
            return 0;
        if (s.charAt(i) == '+' || (isNeg = s.charAt(i) == '-'))
            i++;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            num = num * 10 + (int) (s.charAt(i) - '0');
            i++;
            if (num > Integer.MAX_VALUE) {
                num = isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                break;
            }
        }
        if (isNeg)
            num *= -1;
        return (int) num;
    }
}
