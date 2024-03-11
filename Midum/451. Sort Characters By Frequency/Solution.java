import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> charToInt = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            charToInt.put(t, charToInt.getOrDefault(t, 0) + 1);
        }

        Stream<Map.Entry<Character, Integer>> sorted = charToInt.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed());

        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sorted.collect(Collectors.toList())) {
            char c = entry.getKey();
            for (int i = 0; i < entry.getValue(); i++) {
                stringBuilder.append(c);

            }
        }

        return stringBuilder.toString();
    }
}