import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int key : count.keySet()) {
            if (count.get(key) > nums.length / 3) {
                result.add(key);
            }
        }

        return result;
    }
}
