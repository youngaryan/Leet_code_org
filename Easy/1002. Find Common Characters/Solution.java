import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        int[] minFrequencies = new int[26];
        Arrays.fill(minFrequencies, 101);

        for (String string : words) {
            int[] currentCharCount = new int[26];

            for (char c : string.toCharArray()) {
                currentCharCount[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minFrequencies[i] = Math.min(currentCharCount[i], minFrequencies[i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (minFrequencies[i] > 0) {
                result.add("" + (char) (i + 'a'));
                minFrequencies[i]--;
            }
        }
        return result;
    }
}
