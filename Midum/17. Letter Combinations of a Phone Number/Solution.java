import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty())
            return null;

        List<List<Character>> characters = new ArrayList<>();
        int loc;

        HashMap<Integer, List<Character>> hashMap = new HashMap<>();

        hashMap.put(2, Arrays.asList('a', 'b', 'c'));
        hashMap.put(3, Arrays.asList('d', 'e', 'f'));
        hashMap.put(4, Arrays.asList('g', 'h', 'i'));
        hashMap.put(5, Arrays.asList('j', 'k', 'l'));
        hashMap.put(6, Arrays.asList('m', 'n', 'o'));
        hashMap.put(7, Arrays.asList('p', 'q', 'r', 's'));
        hashMap.put(8, Arrays.asList('t', 'u', 'v'));
        hashMap.put(9, Arrays.asList('x', 'w', 'y', 'z'));

        for (int i = 0; i < digits.length(); i++) {
            loc = digits.charAt(i) - '0';
            characters.add(hashMap.get(loc));
        }

        for (int i = 0; i < characters.size(); i++) {

        }
        return null;
    }
}