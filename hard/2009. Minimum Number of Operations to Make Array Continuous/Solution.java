import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minOperations(int[] nums) {
        int min = Integer.MAX_VALUE;

        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int l = set.size();
        Arrays.sort(nums);

        int r = 0;
        for (int i = 0; i < l; i++) {
            while (r < l && nums[r] < nums[i] + l) {
                r++;
            }

            int w = r - i;

            min = Math.min(min, l - w);
        }
        return min;
    }
}