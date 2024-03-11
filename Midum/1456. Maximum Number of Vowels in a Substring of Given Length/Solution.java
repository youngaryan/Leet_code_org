class Solution {
    public int maxVowels(String s, int k) {

        int t, max = 0, localMax, lastVow = 0;

        for (int i = 0; i < s.length(); i+=k) {
            if (isVowel(s.charAt(i))) {
                t = 1;
                lastVow = i;
                localMax = 1;
                while (i < s.length() - 1 && t < k) {
                    i++;
                    t++;

                    if (isVowel(s.charAt(i))) {
                        localMax++;
                    }

                }
                max = Math.max(localMax, max);
                i = lastVow;
            }
        }

        return max;

    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'u' || c == 'i'
                || c == 'o') {
            return true;
        }

        return false;
    }
}