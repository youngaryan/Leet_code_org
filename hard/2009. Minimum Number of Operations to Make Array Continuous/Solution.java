import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;

        for (int i : nums) {
            set.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            int localMin = 0;
            for (int j = 0; j < nums.length; j++) {
                if (!set.contains(nums[i] + j)) {
                    localMin++;
                }
            }
            min = Math.min(min, localMin);
        }
        return min;
    }
}