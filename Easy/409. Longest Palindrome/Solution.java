class Solution {
    public int longestPalindrome(String s) {
        int[] letters = new int[26 * 2];
        char t;
        int result = 0;
        boolean hasOdd = false;

        for (int i = 0; i < s.length(); i++) {
            t = s.charAt(i);

            if (Character.isUpperCase(t)) {
                letters[t - 'A' + 26]++;
            } else {
                letters[t - 'a']++;
            }
        }

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] % 2 == 0) {
                result += letters[i];
            } else {
                result += letters[i] - 1;
                hasOdd = true;
            }
        }
        return hasOdd ? result + 1 : result;
    }
}