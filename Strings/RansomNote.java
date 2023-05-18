/**
 * 383. Ransom Note
 * 
 */

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            m.put(c, m.get(c) == null ? 1 : m.get(c) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (m.get(c) == null || m.get(c) == 0) {
                return false;
            }
            m.put(c, m.get(c) - 1);
        }
        return true;
    }
}