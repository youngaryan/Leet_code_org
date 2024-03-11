class Solution {
    public int countCharacters(String[] words, String chars) {
        int resultLen = 0;
        int[] counts = new int[26];

        for (int i = 0; i < chars.length(); i++) {
            counts[chars.charAt(i) - 'a']++;
        }

        for (String s : words) {
            resultLen += canbeFormed(s, counts);
        }
        return resultLen;
    }

    private int canbeFormed(String word, int[] counts) {
        int[] copy = new int[26];
        for (int i = 0; i < word.length(); i++) {
            int wordChar = word.charAt(i) - 'a';
            copy[wordChar]++;

            if (counts[wordChar] < copy[wordChar]) {
                return 0;
            }
        }
        return word.length();
    }
}