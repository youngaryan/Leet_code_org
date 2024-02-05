class Solution {
    public int firstUniqChar(String s) {
        int[] integers = new int[26];

        for (int i = 0; i < s.length(); i++) {
            integers[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {

            if (integers[s.charAt(i) - 'a'] == 1) {
                return i;
            }

        }
        return -1;
    }
}