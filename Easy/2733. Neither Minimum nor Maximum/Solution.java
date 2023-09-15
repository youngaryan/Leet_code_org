import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3)
            return -1;

        int max = 0, min = Integer.MAX_VALUE;

        Set<Integer> maxMin = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        // System.out.println(max + " " + min);
        maxMin.add(min);
        maxMin.add(max);

        for (int i = 0; i < 3; i++) {
            if (!maxMin.contains(nums[i])) {
                return nums[i];
            }
        }

        return -1;
    }
}