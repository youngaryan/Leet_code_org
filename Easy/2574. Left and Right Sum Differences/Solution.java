class Solution {
    public int[] leftRightDifference(int[] nums) {
        int i = 0, j = nums.length - 1, maxLeft = 0, maxright = 0;

        int[] result = new int[nums.length];
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        while (i < nums.length && j >= 0) {
            leftSum[i] = maxLeft;
            maxLeft += nums[i];
            i++;
            rightSum[j] = maxright;
            maxright += nums[j];
            j--;
        }

        for (int k = 0; k < rightSum.length; k++) {
            result[k] = Math.abs(leftSum[k] - rightSum[k]);
        }

        return result;
    }
}