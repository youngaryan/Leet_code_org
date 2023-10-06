import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean divideArray(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            if (seen.add(nums[i])) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}