class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length() - 2; i++) {
            String string = s.substring(i, i + 3);
            char[] c = string.toCharArray();

            if (c[0] != c[1] && c[2] != c[1] && c[2] != c[0]) {
                count++;
            }
        }

        return count;
    }
}