import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())return false;

        HashMap<Character, Character> hashMap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), t.charAt(i));
            } else if (t.charAt(i) != hashMap.get(s.charAt(i))) return false;
        }
        System.out.println(hashMap);
        Collection<Character> values = hashMap.values();
        HashSet<Character> set = new HashSet<>(values);

        return set.size() == values.size();
    }
}
