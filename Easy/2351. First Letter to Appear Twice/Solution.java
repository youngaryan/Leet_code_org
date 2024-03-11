import java.util.HashSet;
import java.util.Set;

class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> checkedSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            checkedSet.add(s.charAt(i));
            if (checkedSet.size() != i + 1) {
                return s.charAt(i);
            }

        }
        return '2';
    }
}