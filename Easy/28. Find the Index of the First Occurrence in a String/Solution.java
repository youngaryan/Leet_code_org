class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            if (haystack.charAt(i) == needle.charAt(0)){
                try {
                    while (j<needle.length() && haystack.charAt(i+j) == needle.charAt(j)){
                        j++;
                        if (j == needle.length())
                            return i;
                    }
                } catch (Exception e) {
                    return -1;
                }
            }
        }
        return -1;
    }
}