class Solution {
    public String greatestLetter(String s) {
        int[] letters = new int[52];

        for (char i : s.toCharArray()) {
            if (Character.isUpperCase(i)) {
                letters[i - 'A'+26]++;
            } else {
                letters[i - 'a']++;
            }
        }

        for (int i = 25; i >= 0; i--) {
            if (letters[i] > 0 && letters[i + 26] > 0) {
                return String.valueOf((char)(i+'A'));
            }
        }
        return "";
    }
}