class Solution {
    public int countHomogenous(String s) {
        int c = 1, result = 0, MOD = 1000000007;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                c++;
            } else {
                c = 1;
            }
            result = (result + c) % 1000000007;
        }

        return result + 1;
    }
}