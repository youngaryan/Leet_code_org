class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder result = new StringBuilder();
        int j = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                if (j != k) {
                    result.append(s.charAt(i));
                } else {
                    j = 0;
                    result.append('-');
                    result.append(s.charAt(i));
                }
                j++;
            }
        }
        return result.reverse().toString().toUpperCase();
    }
}