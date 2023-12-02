import java.util.HashMap;

class Solution {
    public int countCharacters(String[] words, String chars) {
        int resultLen = 0;

        for (String string : words) {
            resultLen += helper(string, chars);
        }

        return resultLen;
    }

    private int helper(String string, String chars) {
        if (string.length() > chars.length()) {
            return 0;
        }

        boolean check = true;
        char temp;

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            temp = string.charAt(i);
            map1.put(temp, map1.getOrDefault(temp, 0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            temp = chars.charAt(i);
            map2.put(temp, map2.getOrDefault(temp, 0) + 1);
        }

        for (Character character : map1.keySet()) {
            if (!map2.containsKey(character) || map2.get(character) < map1.get(character)) {
                check = false;
            }
        }
        return check ? string.length() : 0;
    }
}