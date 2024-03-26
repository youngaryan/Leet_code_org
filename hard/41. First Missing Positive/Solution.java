// import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] <= 0 || nums[i] > length) {
                nums[i] = length + 1;
            }
        }

        int tempIdx;
        for (int i = 0; i < length; i++) {
            tempIdx = Math.abs(nums[i]) - 1;

            if (tempIdx < 0 || tempIdx > length - 1) {
                continue;
            }

            nums[tempIdx] = -Math.abs(nums[tempIdx]);
        }

        // System.out.println(Arrays.toString(nums));

        for (int i = 0; i < length; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }
        return length + 1;

    }
}