import java.util.HashSet;
import java.util.Set;

class Solution {
    public int firstUniqChar(String s) {
        Set<Integer> integers = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!integers.add(s.charAt(i) - 'a')) {
                duplicates.add(s.charAt(i) - 'a');
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (!duplicates.contains(s.charAt(i) - 'a')) {
                return i;
            }
        }
        return -1;
    }
}

/*
 * Example 1:
 * 
 * Input: s = "leetcode"
 * Output: 0
 * 
 * Example 2:
 * 
 * Input: s = "loveleetcode"
 * Output: 2
 * 
 * Example 3:
 * 
 * Input: s = "aabb"
 * Output: -1
 */