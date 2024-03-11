class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = Integer.MIN_VALUE, j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                if (max < i - j) {
                    max = i - j;
                }
                j = i;
            }
        }

        return Math.max(max, nums.length - j);
    }
}