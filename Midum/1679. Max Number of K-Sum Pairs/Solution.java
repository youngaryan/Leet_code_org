import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        int i = 0, j = nums.length - 1, max = 0;

        Arrays.sort(nums);
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                i++;
                j--;
                max++;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}