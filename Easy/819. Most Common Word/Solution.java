import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] result = paragraph.replaceAll("\\W+", " ").toLowerCase().split("\\s+");
        HashMap<String, Integer> hashMap = new HashMap<>();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        for (int i = 0; i < result.length; i++) {
            if (!bannedSet.contains(result[i])) {
                hashMap.put(result[i], hashMap.getOrDefault(result[i], 0) + 1);
            }
        }
        // System.out.println(paragraph);
        // System.out.println(Arrays.toString(result));
        // System.out.println(hashMap);
        return Collections.max(hashMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}