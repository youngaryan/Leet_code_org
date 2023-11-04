class Solution {
    public String reverseStr(String s, int k) {
        int l = s.length();

        char[] h = s.toCharArray();
        int i = 0;

        for (int j = 0; j < h.length; j += 2 * k) {
            i = j;
            int r = k - 1 + i;

            if (r > l - 1) {
                r = l - 1;
            }
            while (i < r) {
                h[i] = s.charAt(r);
                h[r] = s.charAt(i);
                i++;
                r--;
            }
        }

        String r = new String(h);
        return r;
    }
}