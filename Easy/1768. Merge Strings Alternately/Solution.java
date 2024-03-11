class Solution {
    public String mergeAlternately(String word1, String word2) {
        int lenW1 = word1.length(), lenW2 = word2.length(), i = 0, j = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while (i < lenW1 && j < lenW2) {
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(j));
            i++;
            j++;
        }

        if (i < lenW1) {
            stringBuilder.append(word1.substring(i));

        }
        if (j < lenW2) {
            stringBuilder.append(word2.substring(j));

        }
        return stringBuilder.toString();
    }
}