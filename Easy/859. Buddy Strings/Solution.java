
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int[] letters1 = new int[26];
        boolean check = false;

        for (int i = 0; i < s.length(); i++) {
            letters1[s.charAt(i) - 'a']++;
            if (letters1[s.charAt(i) - 'a'] > 1) {
                check = true;
            }
        }
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                t++;
            }
            letters1[goal.charAt(i) - 'a']--;

        }

        for (int i = 0; i < 26; i++) {
            if (letters1[i] != 0) {
                return false;
            }
        }

        return (check && t == 0) || t == 2;
    }
}