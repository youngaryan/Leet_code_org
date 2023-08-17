class Solution {
    public int dominantIndex(int[] nums) {
        int index = -1, max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secMax) {
                secMax = nums[i];
            }
        }

        return secMax * 2 <= max ? index : -1;
    }
}