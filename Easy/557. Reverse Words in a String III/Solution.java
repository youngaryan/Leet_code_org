class Solution {
    public String reverseWords(String s) {

        char[] sChar = s.toCharArray();
        int b = 0;

        for (int i = 0; i < sChar.length; i++) {
            if (sChar[i] == ' ') {
                sChar = (reverse(sChar, b, i - 1));
                b = i + 1;
            }
        }

        sChar = reverse(sChar, b, sChar.length - 1);
        return new String(sChar);
    }

    private char[] reverse(char[] sChar, int b, int i) {
        char t;
        while (i > b) {
            t = sChar[i];
            sChar[i] = sChar[b];
            sChar[b] = t;
            i--;
            b++;
        }

        return sChar;
    }

}
