class Solution {
    public String decodeAtIndex(String s, int k) {
        int i = 0;
        long size = 0;

        char c;

        while (size < k) {
            c = s.charAt(i);

            if (Character.isDigit(c)) {
                size *= c - '0';
            } else {
                size++;
            }

            i++;
        }

        i--;

        while (true) {
            c = s.charAt(i);

            if (Character.isDigit(c)) {
                size /= c - '0';
                k %= size;
            } else {
                if (k % size == 0) {
                    return String.valueOf(c);
                }
                size--;
            }
            i--;
        }
    }
}