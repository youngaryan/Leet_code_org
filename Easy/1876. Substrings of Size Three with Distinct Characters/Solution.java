import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length() - 2; i++) {
            set.clear();
            for (int j = i; j < i + 3; j++) {
                set.add(s.charAt(j));
                if (set.size() != j - i + 1) {
                    break;
                } else if (set.size() == 3) {
                    count++;
                }
            }
        }

        return count;
    }
}