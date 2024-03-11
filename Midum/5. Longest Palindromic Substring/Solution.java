class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String maxLengthPa = "";

        for (int i = 0; i < s.length(); i++) {
            // odd length
            int l = i, r = i;

            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLength) {
                    maxLength = r - l + 1;
                    maxLengthPa = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
            // even lenght
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLength) {
                    maxLength = r - l + 1;
                    maxLengthPa = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
        }

        return maxLengthPa;
    }
}