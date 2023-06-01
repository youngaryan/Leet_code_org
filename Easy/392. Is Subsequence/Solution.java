public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.length() == 0) return true;
        int sPointer = 0, tPointer = 0, count = 0;

        while (t.length() > tPointer && s.length()>sPointer){
            if (t.charAt(tPointer) == s.charAt(sPointer)){
                count++;
                tPointer++;
                sPointer++;
            }
            else
                tPointer++;
        }

        return count == s.length();
    }
}
