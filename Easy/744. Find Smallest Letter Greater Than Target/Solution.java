public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min = Integer.MAX_VALUE;

        for (char letter : letters) {
            if (letter < min && letter > target) {
                min = letter;
            }
        }
        if (min>122)return letters[0];
        return (char) min;
    }
}
