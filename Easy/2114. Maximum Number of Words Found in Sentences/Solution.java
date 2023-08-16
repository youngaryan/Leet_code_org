class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE, loc;

        for (int i = 0; i < sentences.length; i++) {
            loc = sentences[i].split(" ").length;
            if (loc > max) {
                max = loc;
            }
        }
        return max;
    }
}