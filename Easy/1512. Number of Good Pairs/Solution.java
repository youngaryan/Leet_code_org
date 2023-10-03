import java.util.HashMap;
import java.util.Set;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0, temp;

        for (int i : nums) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        Set<Integer> keys = hashMap.keySet();

        for (int i : keys) {
            if (hashMap.get(i) > 1) {
                temp = hashMap.get(i);
                count += temp * (temp - 1) / 2;
            }
        }
        return count;
    }
}