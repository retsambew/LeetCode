/*
 * 58. Length of Last Word
 */

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == ' ')
                break;
            i--;
        }
        return s.length() - i - 1;
    }

    // public int lengthOfLastWord(String s) {
    // String[] splitString = s.split(" ");
    // int num = splitString[splitString.length - 1].length();
    // return num;
    // }
}
