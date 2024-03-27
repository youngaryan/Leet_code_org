// import java.util.Arrays;

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int count = 0, left = 0, temPro = 1;

        for (int right = 0; right < nums.length; right++) {
            temPro *= nums[right];

            while (temPro >= k) {
                temPro /= nums[left];
                left++;

            }
            count += right - left + 1;

        }

        return count;
    }
}