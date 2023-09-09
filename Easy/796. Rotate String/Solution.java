class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        int start = -1, j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == goal.charAt(0)) {
                start = i;
                break;
            }
        }
        if (start == -1)
            return false;

        for (int i = start; i < s.length() + start; i++) {
            if (s.charAt(i % s.length()) != goal.charAt(j)) {
                return false;
            }
            j++;
        }

        return true;
    }
}
/*
 * Input: s = "abcde", goal = "cdeab"
 * Output: true
 */