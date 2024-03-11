class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE, localMax = Integer.MIN_VALUE, start = 0, end = 1, temp = 1;

        while (end < nums.length) {
            temp = nums[end] * nums[start];
            if (localMax > temp) {
                temp = 1;
                start = end;
                end++;
                continue;
            }
            localMax = temp;
            if (localMax > max) {
                max = localMax;
            }
            end++;
        }
        return max;
    }
}