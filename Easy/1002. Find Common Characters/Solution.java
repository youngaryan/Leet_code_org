import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> commonCharsMap = new HashMap<>();

        for (char c : words[0].toCharArray()) {
            commonCharsMap.put(c, commonCharsMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> currentWordMap = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                currentWordMap.put(c, currentWordMap.getOrDefault(c, 0) + 1);
            }

            List<Character> toRemove = new ArrayList<>();
            for (char key : commonCharsMap.keySet()) {
                if (currentWordMap.containsKey(key)) {
                    commonCharsMap.put(key, Math.min(commonCharsMap.get(key), currentWordMap.get(key)));
                } else {
                    toRemove.add(key);
                }
            }

            for (char key : toRemove) {
                commonCharsMap.remove(key);
            }
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : commonCharsMap.entrySet()) {
            char character = entry.getKey();
            int frequency = entry.getValue();

            for (int i = 0; i < frequency; i++) {
                result.add(String.valueOf(character));
            }
        }

        return result;
    }
}
