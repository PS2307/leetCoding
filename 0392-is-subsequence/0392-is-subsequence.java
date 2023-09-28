public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int sx = 0, tx = 0;
        while (tx < t.length()) {
            if (t.charAt(tx) == s.charAt(sx)) {
                sx++;
                if (sx == s.length()) return true;
            }
            tx++;
        }
        return false;
    }
}