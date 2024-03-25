import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int temp, sec;
        for (int i = 0; i < nums.length; i++) {
            temp = Math.abs(nums[i]);

            if (nums[temp - 1] < 0) {
                res.add(temp);
            } else {
                nums[temp - 1] = -nums[temp - 1];
            }
        }
        return res;

    }
}

// out.println(new Solution().findDuplicates(new int[] {
// 4,3,2,7,8,2,3,1
// [1,1,2]