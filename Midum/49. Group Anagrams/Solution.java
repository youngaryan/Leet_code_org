import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] tmp = strs[i].toCharArray();

            Arrays.sort(tmp);

            String key = new String(tmp);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(strs[i]);
        }

        List<List<String>> result = new ArrayList<>();

        for (List<String> list : map.values()) {
            result.add(list);
        }
        return result;
    }
}