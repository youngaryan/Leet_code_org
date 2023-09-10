class Solution {
    public String firstPalindrome(String[] words) {
        for (String string : words) {
            if (checkPal(string)) {
                return string;
            }
        }
        return "";
    }

    private boolean checkPal(String string) {
        int i = 0, j = string.length() - 1;

        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}