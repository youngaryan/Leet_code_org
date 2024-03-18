class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        return helper(nums, goal) - helper(nums, goal - 1);
    }

    private int helper(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }

        int count = 0, l = 0, curSum = 0;

        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];

            while (curSum > goal) {
                curSum -= nums[l];
                l++;
            }

            count += i - l + 1;
        }
        return count;
    }
}