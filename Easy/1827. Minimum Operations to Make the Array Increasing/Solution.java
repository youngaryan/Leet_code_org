class Solution {
    public int minOperations(int[] nums) {
        int c = 0, t;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                t = nums[i - 1] - nums[i] + 1;
                c += t;
                nums[i] += t;
            }
        }
        return c;
    }
}