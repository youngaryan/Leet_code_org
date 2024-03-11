class Solution {
    public int compress(char[] chars) {

        int re = 0;

        for (int i = 0; i < chars.length;) {
            char letter = chars[i];
            int c = 0;

            while (i < chars.length && chars[i] == letter) {
                ++c;
                ++i;
            }
            chars[re++] = letter;

            if (c > 1) {

                for (char ch : String.valueOf(c).toCharArray()) {
                    chars[re++] = ch;
                }
            }
        }

        return re;
    }
}