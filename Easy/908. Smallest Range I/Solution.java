class Solution {
    public int smallestRangeI(int[] nums, int k) {
        if (nums.length == 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, mean;

        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        mean = (max + min) / 2;

        if (max - k <= mean) {
            max = mean;
        } else {
            max -= k;
        }
        if (min + k >= mean) {
            min = mean;
        } else {
            min += k;
        }

        return max - min;
    }
}