import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<String> commonChars(String[] words) {
        String first = words[0];
        Set<Character> notResult = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < first.length(); i++) {
            char current = first.charAt(i);
            boolean foundInAll = true;

            for (int j = 1; j < words.length; j++) {
                if (!words[j].contains(String.valueOf(current))) {
                    foundInAll = false;
                    break;
                }
            }
            if (foundInAll) {
                if (!notResult.contains(current)) {
                    result.add(String.valueOf(current));
                }
            } else {
                notResult.add(current);
            }
        }

        return result;
    }
}// "bella", "label", "roller"