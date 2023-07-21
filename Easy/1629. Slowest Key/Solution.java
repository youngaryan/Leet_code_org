import java.util.HashMap;
import java.util.Map;

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        Map<Character,Integer> map = new HashMap<>();

        map.put(keysPressed.charAt(0), releaseTimes[0]);

        char result = keysPressed.charAt(0);
        int max = releaseTimes[0];    

        for (int i = 1; i < keysPressed.length(); i++) {
            char key = keysPressed.charAt(i);
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            if (!map.containsKey(key)) {
                map.put(key, duration);
            } else {
                map.put(key, Math.max(map.get(key), duration));
            }
            if (map.get(key) > max || (map.get(key) == max && key > result)) {
                max = map.get(key);
                result = key;
            }
        }
        return result;
    }
}