import java.util.Arrays;

class Solution {
    public int findShortestSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        Arrays.sort(nums);
        int j = 0, max = -1, current = -1;

        for (int i = j; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                if (max < i - j) {
                    max = i - j;
                    current = nums[j];
                }
                j = i;
                i = j + 1;
            }
        }

        return current == -1 ? nums.length : current * max;
    }
}