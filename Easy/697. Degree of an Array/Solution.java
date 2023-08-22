import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int current = -1, max = -1;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (max <= map.get(nums[i])) {
                current = nums[i];
                max = map.get(nums[i]);
            }
        }

        System.out.println(current);
        return max;
    }
}