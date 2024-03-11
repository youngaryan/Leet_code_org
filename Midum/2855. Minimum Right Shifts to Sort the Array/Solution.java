import java.util.Collections;
import java.util.List;

class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int count = 0, min = Collections.min(nums), i = 0;

        while (true) {
            if (nums.get(i) == min) {
                break;
            }
            if (nums.get(i) > nums.get(i + 1)) {
                return -1;
            }
            i++;
            count++;
        }

        i++;
        while (i < nums.size() - 1) {
            if (nums.get(i) > nums.get(i + 1)) {
                return -1;
            }
            i++;
        }
        return count;
    }
}