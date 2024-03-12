class Solution {
    public int maxVowels(String s, int k) {
        int max = 0, left = 0, right = k, localMax = -1;
        while (left < s.length()) {
            while (!isVowel(s.charAt(left))) {
                left++;
            }
            localMax = 0;
            right = left + k;
            if (right > s.length()) {
                right = s.length();
            }
            for (int i = left; i < right; i++) {

                if (isVowel(s.charAt(i))) {
                    localMax++;
                }
            }

            System.out.println(max);
            System.out.println(left);
            left = left + k > s.length() ? s.length() - k : left + k;
            max = Math.max(max, localMax);
            
            if (left == s.length()) {
                break;
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