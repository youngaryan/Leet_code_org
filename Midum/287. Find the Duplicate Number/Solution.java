import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findDuplicate(int[] nums) {

        Set<Integer> hold = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hold.add(nums[i]);
            if (hold.size() != i + 1) {
                return nums[i];
            }
        }

        return -1;
    }
}